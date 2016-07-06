package de.cooperateproject.modeling.transformation.transformations.tests.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.eclipse.m2m.qvt.oml.util.Log;

public class Log4JLogger implements Log {

	private final Logger logger;
	private final Priority defaultPriority;
	
	public Log4JLogger(Logger logger, Priority defaultPriority) {
		this.logger = logger;
		this.defaultPriority = defaultPriority;
	}
	
	@Override
	public void log(int level, String message, Object param) {
		log(level, createLogMessage(message, param));
	}

	@Override
	public void log(int level, String message) {
		Priority prio = Level.toLevel(level);
		logger.log(prio, message);
	}

	@Override
	public void log(String message, Object param) {
		log(createLogMessage(message, param));
	}

	@Override
	public void log(String message) {
		logger.log(defaultPriority, message);
	}
	
	private static final String createLogMessage(String message, Object param) {
		return String.format("%s - Date: %s", message, param == null ? "null" : param.toString());
	}

}
