package com.cs4.appointmentManagement.jms;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class RegistrationJmsSender implements MessageSender {
	@Autowired
	@Qualifier(value="jmsTemplateRegistration")
	private JmsTemplate jmsTemplateRegistration;

	@Override
	public void sendMessage(Object object) {
		this.jmsTemplateRegistration.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage((Serializable)object);
			}
		});
	}
}
