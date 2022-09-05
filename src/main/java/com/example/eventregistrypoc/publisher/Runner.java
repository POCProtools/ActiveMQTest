package com.example.eventregistrypoc.publisher;

import com.example.eventregistrypoc.model.SurveyInfo;
import com.example.eventregistrypoc.model.TestObject;
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
    public void sendSurvey(SurveyInfo surveyInfo) {
        rabbitTemplate.convertAndSend(queue.getName(), surveyInfo);
        logger.info("Sending Message to the Queue : " + surveyInfo.toString());
    }
    public void sendTest(TestObject testObject) {
        rabbitTemplate.convertAndSend(queue.getName(), testObject);
        logger.info("Sending Test Message to the Queue : " );
    }
}
