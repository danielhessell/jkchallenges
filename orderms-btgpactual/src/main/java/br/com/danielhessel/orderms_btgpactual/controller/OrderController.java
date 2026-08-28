package br.com.danielhessel.orderms_btgpactual.controller;

import br.com.danielhessel.orderms_btgpactual.controller.dto.ApiResponse;
import br.com.danielhessel.orderms_btgpactual.controller.dto.PaginationResponse;
import br.com.danielhessel.orderms_btgpactual.service.OrderService;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customers/{customerId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOrders(@PathVariable("customerId") Long customerId,
                                                                 @RequestParam(name="page", defaultValue = "0") Integer page,
                                                                 @RequestParam(name="pageSize", defaultValue = "10") Integer pageSize) {

        var result = orderService.findAllByCustomerId(customerId, PageRequest.of(page, pageSize));
        var totalOnOrders = orderService.findTotalOnOrdersByCustomerId(customerId);
        return ResponseEntity.ok(new ApiResponse<>(
                Map.of("totalOnOrders", totalOnOrders),
                result.getContent(),
                PaginationResponse.fromPage(result)
        ));
    }
}
