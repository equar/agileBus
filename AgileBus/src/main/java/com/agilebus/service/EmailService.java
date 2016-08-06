package com.agilebus.service;

import com.agilebus.model.EmailBean;

public interface EmailService {
	public boolean sendEmail(EmailBean emailBean) throws Exception;

}
