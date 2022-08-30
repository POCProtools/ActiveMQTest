package com.example.activemqpoc.consumer.component;

import com.example.activemqpoc.model.SurveyInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// Respond to received messages
@Component
public class Receiver {
    private static Logger logger = LogManager.getLogger(Receiver.class.toString());
    @RabbitHandler
    public void receiver(SurveyInfo surveyInfo) {
        logger.info("MenuOrder listener invoked - Consuming Message with Survey Identifier : " + surveyInfo.getSurveyId());
    }
}
