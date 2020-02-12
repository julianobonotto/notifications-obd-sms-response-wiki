# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Security](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security-oauth2-client)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security-oauth2-server)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-redis)
* [Spring Data Reactive MongoDB](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-mongodb)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-redis)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-mongodb)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-integration)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-amqp)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#howto-batch-applications)
* [Spring cache abstraction](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-caching)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-email)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)
* [Config Client (PCF)](https://docs.pivotal.io/spring-cloud-services/)
* [Service Registry (PCF)](https://docs.pivotal.io/spring-cloud-services/)
* [Circuit Breaker (PCF)](https://docs.pivotal.io/spring-cloud-services/)

### Guides
The following guides illustrate how to use some features concretely:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Client Side Load Balancing with Ribbon and Spring Cloud](https://spring.io/guides/gs/client-side-load-balancing/)
* [Circuit Breaker](https://spring.io/guides/gs/circuit-breaker/)

# Spring Cloud Netflix Maintenance Mode

The dependencies listed below are in maintenance mode. We do not recommend adding them to
new projects:

*  Hystrix Dashboard
*  Hystrix
*  Ribbon

The decision to move most of the Spring Cloud Netflix projects to maintenance mode was
a response to Netflix not continuing maintenance of many of the libraries that we provided
support for.

Please see [this blog entry](https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now#spring-cloud-netflix-projects-entering-maintenance-mode)
for more information on maintenance mode and a list of suggested replacements for those
libraries.
