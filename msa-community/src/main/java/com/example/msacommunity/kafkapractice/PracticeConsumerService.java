package com.example.msacommunity.kafkapractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class PracticeConsumerService {
    private final Logger logger = LoggerFactory.getLogger(PracticeConsumerService.class);

    @KafkaListener(topics = "board-topic", groupId = "group-so")
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}