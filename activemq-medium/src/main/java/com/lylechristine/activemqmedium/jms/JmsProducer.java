package com.lylechristine.activemqmedium.jms;

import com.lylechristine.activemqmedium.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${active-mq.topic}")
    private String topic;

    public void sendMessage(Employee message) {
        try {
            log.info("Attempting to send message to topic " + topic);
            jmsTemplate.convertAndSend(topic, message);
        } catch (Exception e) {
            log.error("Received exception during attempt to send message: ", e);
        }
    }
}
