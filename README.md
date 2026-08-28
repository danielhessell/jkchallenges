# jkchallenges

Repositório com projetos desafio em Java/Kotlin, cada um em seu próprio módulo Maven independente.

## Projetos

### `notifierms`
Serviço de notificações em Spring Boot. Agenda envios, consulta status e permite cancelamento via API REST, com persistência em MySQL.

### `orderms-btgpactual`
Serviço de pedidos em Spring Boot. Consome eventos de criação de pedido via RabbitMQ e expõe API REST para consulta, com persistência em MongoDB.

## Stack comum
- Java + Spring Boot
- Maven
