package com.agilebus.util;

import org.apache.log4j.Logger;

public class agileUtil {
	private static final Logger logger = Logger.getLogger(agileUtil.class);

	// logging functionality
	public static void log(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.debug(parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info(parameter);
		}

		logger.warn(parameter);
		logger.error(parameter);
		logger.fatal(parameter);
	}
	
	
	

}
