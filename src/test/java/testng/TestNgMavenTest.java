package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utlities.DateUtils;

public class TestNgMavenTest {
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenTest.class);

    @Test
    public void run() {
        // The below with the help of log4j lets us see the below logger separated by color
//    LOGGER.debug("This is debug message");
//    LOGGER.info("This is info message");
//    LOGGER.warn("This is a warning");
//    LOGGER.error("This is an error");
//    LOGGER.fatal("This is dangerous");
//    LOGGER.trace("General Information");

        //The below is testing our DateUtils Class
        System.out.println(DateUtils.returnNextMonth());


    }


    //public void testPropertyFile() {
    //    LOGGER.info(ReadConfigFiles.getPropertiesValues("Dbuser")); }
}