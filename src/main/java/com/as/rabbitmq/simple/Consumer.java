package com.as.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "my_simple_queue")
public class Consumer {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("消费者：接收 msg -> " + msg);
    }
}
