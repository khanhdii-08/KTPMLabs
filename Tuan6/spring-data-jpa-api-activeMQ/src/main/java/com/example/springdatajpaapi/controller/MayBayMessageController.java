package com.example.springdatajpaapi.controller;

import com.example.springdatajpaapi.entity.MayBay;
import com.example.springdatajpaapi.jms.JmsProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSProducer;

@RestController
@Slf4j
public class MayBayMessageController {
    @Autowired
    JmsProducer jmsProducer;

    @PostMapping(value="/api/jms/maybay")
    public MayBay sendMessage(@RequestBody MayBay maybay){
        jmsProducer.sendMessage(maybay);
        return maybay;
    }
}
