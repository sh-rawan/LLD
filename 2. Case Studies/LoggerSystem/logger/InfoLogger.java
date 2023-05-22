package LoggerSystem.logger;

import LoggerSystem.data.LogLevel;
import LoggerSystem.publisher.Publisher;

public class InfoLogger implements Logger {
    private final Logger nextLogger;
    private final Publisher logPublisher;

    public InfoLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel.getLevel() == LogLevel.INFO.getLevel()) {
            logPublisher.notify(LogLevel.ERROR + " " + message);
        }
        this.nextLogger.log(logLevel, message);
    }

}
