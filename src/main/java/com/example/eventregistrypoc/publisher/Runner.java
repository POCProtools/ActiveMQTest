package com.example.eventregistrypoc.publisher;

import com.example.eventregistrypoc.model.SurveyInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Runner {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private Queue queue;
    private static Logger logger = LogManager.getLogger(Runner.class.toString());

    // Add message to the queue
    public void send(SurveyInfo surveyInfo) {
        rabbitTemplate.convertAndSend(queue.getName(), surveyInfo);
        logger.info("Sending Message to the Queue : " + surveyInfo.toString());
    }
}
