package com.example.eventregistrypoc.controller;

import com.example.eventregistrypoc.model.SurveyInfo;
import com.example.eventregistrypoc.model.TestObject;
import com.example.eventregistrypoc.publisher.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbitmq")
public class RabbitMQController {
    @Autowired
    Runner rabbitMQSender;
    @PostMapping(value = "/sender")
    public String producer(@RequestBody TestObject testObject) {
        rabbitMQSender.sendTest(testObject);
        return "Test Message sent to the RabbitMQ Queue Successfully";
    }
}
