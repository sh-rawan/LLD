package LoggerSystem;

import LoggerSystem.data.LogLevel;
import LoggerSystem.logger.Logger;
import LoggerSystem.logger.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger();
        logger.log(LogLevel.ERROR, "DB query failed");
        System.out.println();
        System.out.println();
        logger.log(LogLevel.DEBUG, "DB query failed");
    }
}
