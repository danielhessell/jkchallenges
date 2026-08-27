package br.com.danielhessel.orderms_btgpactual.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "btg-pactual-order-created";
}
