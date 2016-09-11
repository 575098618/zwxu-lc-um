package com.zwxu.lc.um.service;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ProxyJMSProducer {
	@Autowired
	private JmsTemplate jmsTemplate;
    //getter and setter
   
    
    public void sendInfo() {
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setString("lastName", "ppp");
                return message;
            }

        });
    }

}
