package utlities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfigFiles {
    private static final Logger LOGGER = LogManager.getLogger(LoadConfigFiles.class);

    public Properties readPropertyValues() throws IOException {
        Properties prop = new Properties();
        InputStream inputSteam = null;
        try {
            String propFileName = "config.properties";
            inputSteam = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputSteam != null) {
                prop.load(inputSteam);
            } else {
                throw new FileNotFoundException("Property File " + propFileName + " not found in the classpath");
            }
        }  catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        } finally {
            inputSteam.close();
        }
        return prop;
    }



}
