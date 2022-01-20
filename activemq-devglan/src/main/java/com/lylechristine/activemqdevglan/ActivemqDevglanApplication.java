package com.lylechristine.activemqdevglan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqDevglanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqDevglanApplication.class, args);
    }

}
