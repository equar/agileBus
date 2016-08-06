package com.agilebus.service.impl;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.agilebus.model.EmailBean;
import com.agilebus.service.EmailService;

public class EmailServiceImpl implements EmailService{
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public boolean sendEmail(EmailBean emailBean) throws Exception{

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(emailBean.getFrom());
		message.setTo(emailBean.getTo());
		message.setSubject(emailBean.getSubject());
		message.setText(emailBean.getMessage());
		mailSender.send(message);
		return true;
	}

}
