package com.agilebus.delegate;

import com.agilebus.model.EmailBean;
import com.agilebus.service.EmailService;

public class EmailDelegate {
	private EmailService emailService;

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public boolean sendEmail(EmailBean emailBean) throws Exception {
		return emailService.sendEmail(emailBean);
	}

}
