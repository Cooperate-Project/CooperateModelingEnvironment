package de.cooperateproject.modeling.transformation.common.impl;

import java.util.Arrays;

import org.eclipse.m2m.qvt.oml.util.Log;
import org.slf4j.Logger;

/**
 * Implementation of {@link Log} that delegates log messages to the SLF4J logging framework.
 */
public class Slf4JLogger implements Log {

    @SuppressWarnings("squid:S1312")
    private final Logger delegationTarget;
    private final Level defaultPriority;

    /**
     * Constructs the logger.
     * 
     * @param logger
     *            The SLF4J logger that will be the delegation target for log messages.
     */
    public Slf4JLogger(Logger logger) {
        this(logger, Level.DEBUG);

    }

    /**
     * Constructs the logger.
     * 
     * @param logger
     *            The SLF4J logger that will be the delegation target for log messages.
     * @param defaultPriority
     *            The default log level that shall be used to log incoming messages without level.
     */
    public Slf4JLogger(Logger logger, Level defaultPriority) {
        this.delegationTarget = logger;
        this.defaultPriority = defaultPriority;

    }

    @Override
    public void log(int level, String message, Object param) {
        log(level, createLogMessage(message, param));
    }

    @Override
    public void log(int level, String message) {
        log(Level.toLevel(level), message);
    }

    /**
     * Logs a message at the specified logging level.
     * 
     * @param level
     *            the level value to which the resulting log record should apply
     * @param message
     *            the textual message to be logged
     */
    public void log(Level level, String message) {
        switch (level) {
        case TRACE:
            delegationTarget.trace(message);
            break;
        case DEBUG:
            delegationTarget.debug(message);
            break;
        case INFO:
            delegationTarget.info(message);
            break;
        case WARN:
            delegationTarget.warn(message);
            break;
        case ERROR:
            delegationTarget.error(message);
            break;
        }

    }

    @Override
    public void log(String message, Object param) {
        log(createLogMessage(message, param));
    }

    @Override
    public void log(String message) {
        log(defaultPriority, message);
    }

    private static final String createLogMessage(String message, Object param) {
        return String.format("%s - Date: %s", message, param == null ? "null" : param.toString());
    }

    /**
     * Log levels the {@link Slf4JLogger} can handle.
     */
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

        /**
         * Converts a level given as integer to a enum literal.
         * 
         * @param level
         *            The level to be converted.
         * @return The enum literal representing the given level. If there is no literal for the given level,
         *         {@link Level#TRACE} will be returned.
         */
        public static Level toLevel(int level) {
            return Arrays.asList(Level.values()).stream().filter(literal -> literal.value == level).findFirst()
                    .orElse(TRACE);
        }

    }

}
