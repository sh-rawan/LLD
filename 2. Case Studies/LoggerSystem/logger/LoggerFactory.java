package LoggerSystem.logger;

import LoggerSystem.publisher.LogPublisher;
import LoggerSystem.publisher.Publisher;
import LoggerSystem.subcriber.ConsoleSubscriber;
import LoggerSystem.subcriber.FileSubscriber;

public class LoggerFactory {
    private LoggerFactory() {
    }

    public static Logger getLogger() {
        Publisher debugInfoPub = new LogPublisher();
        debugInfoPub.subscribe(new ConsoleSubscriber());
        Publisher warnAndAbovePub = new LogPublisher();
        warnAndAbovePub.subscribe(new ConsoleSubscriber());
        warnAndAbovePub.subscribe(new FileSubscriber());
        return new DebugLogger(new InfoLogger(
                new WarnLogger(new ErrorLogger(new AnalyticsLogger(new IdleLogger(), warnAndAbovePub), warnAndAbovePub),
                        warnAndAbovePub),
                debugInfoPub), debugInfoPub);
    }
}
