package com.example.springactivemqreciever.jms;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQTextMessage;
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
            if (message instanceof ActiveMQTextMessage) {
                ActiveMQTextMessage msg =(ActiveMQTextMessage) message;
                log.info("Received Message from Topic: "+ msg.getText());
            }
            else {

                ObjectMessage objectMessage = (ObjectMessage)message;
            }
        } catch(Exception e) {
            log.error("Received Exception while processing message: "+ e);
        }
    }
}
