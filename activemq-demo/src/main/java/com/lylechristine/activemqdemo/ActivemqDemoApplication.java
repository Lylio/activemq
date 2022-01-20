package com.lylechristine.activemqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class ActivemqDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ActivemqDemoApplication.class, args);

        JmsTemplate jms = ctx.getBean(JmsTemplate.class);
        jms.convertAndSend("lylio", "test message from Lylio");
    }

}
