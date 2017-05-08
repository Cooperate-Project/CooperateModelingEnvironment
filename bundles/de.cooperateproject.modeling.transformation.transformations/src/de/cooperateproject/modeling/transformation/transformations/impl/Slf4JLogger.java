package de.cooperateproject.modeling.transformation.transformations.impl;

import org.eclipse.m2m.qvt.oml.util.Log;
import org.slf4j.Logger;

public class Slf4JLogger implements Log {

    private final Logger logger;
    private final Level defaultPriority;

    public Slf4JLogger(Logger logger) {
        this.logger = logger;
        this.defaultPriority = Level.DEBUG;

    }

    public Slf4JLogger(Logger logger, Level defaultPriority) {
        this.logger = logger;
        this.defaultPriority = defaultPriority;

    }

    @Override
    public void log(int level, String message, Object param) {
        log(level, createLogMessage(message, param));
    }

    @Override
    public void log(int level, String message) {
        switch (Level.toLevel(level)) {
        case TRACE:
            logger.trace(message);
            break;
        case INFO:
            logger.trace(message);
        case WARN:
            logger.trace(message);
        case ERROR:
            logger.trace(message);
        }

    }

    @Override
    public void log(String message, Object param) {
        log(createLogMessage(message, param));
    }

    @Override
    public void log(String message) {
        logger.debug(message);
    }

    private static final String createLogMessage(String message, Object param) {
        return String.format("%s - Date: %s", message, param == null ? "null" : param.toString());
    }

    public enum Level {
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4);

        private final int value;

        private Level(int value) {
            this.value = value;
        }

        public static Level toLevel(int level) {
            return Level.values()[level];
        }

    }

}
