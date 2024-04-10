package com.as.config;


import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;


@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue simpleQueue() {
        return new Queue("my_simple_queue");
    }

}


