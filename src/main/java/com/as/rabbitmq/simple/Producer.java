package com.as.rabbitmq.simple;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send() {
        String msg = "Hello";
        System.out.println("生产者：发送 msg -> " + msg);
        amqpTemplate.convertAndSend("my_simple_queue", msg);
    }
}
