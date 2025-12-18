package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLogger {
    private static Logger logger = Logger.getLogger(MyLogger.class);

    static {
        // Sınıf ilk yüklendiğinde log4j.properties dosyasını yükler
        PropertyConfigurator.configure("src/test/resources/log4j.properties");
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }
    //Test case başlangıcını güzel bir formatta loglar
    public static void startTestCase(String sTestCaseName) {
        logger.info("****************************************************************************************");
        logger.info("*********************************** " + sTestCaseName + " STARTED ***********************************");
        logger.info("****************************************************************************************");
    }
}

