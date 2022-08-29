package com.example.demo.consumer.component;

import com.example.demo.model.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "FlowableTest-queue")
    public void messageListener(SystemMessage systemMessage) {
        LOGGER.info("Message received! {}", systemMessage);
    }
}
