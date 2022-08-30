package com.example.activemqpoc.consumer.component;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

// Respond to received messages
@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
