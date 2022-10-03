package com.example.springdatajpaapi.jms;

import com.example.springdatajpaapi.entity.MayBay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@Component
@Slf4j
public class JmsConsumer implements MessageListener {

    @Override
    @JmsListener(destination = "${spring.active-mq.topic}")
    public void onMessage(Message message) {
        try{
            ObjectMessage objectMessage = (ObjectMessage)message;
            MayBay mayBay = (MayBay) objectMessage.getObject();
            //do additional processing
            log.info("Received Message from Topic: "+ mayBay.toString());
        } catch(Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }
    }
}
