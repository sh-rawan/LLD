package LoggerSystem.logger;

import LoggerSystem.data.LogLevel;

public interface Logger {
    void log(LogLevel logLevel, String message);
}
