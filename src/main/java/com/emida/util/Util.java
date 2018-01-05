package com.emida.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {

    private static final Logger LOG = Logger.getLogger(Util.class.getName());

    public static void takeScreenShot(WebDriver driver, String imageName, String Folder) {
        File directory = new File(Folder);
        try {
            if (directory.isDirectory()) {
                File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(imagen, new File(directory.getAbsolutePath() + "\\" + imageName + ".png"));
            } else {
                throw new IOException("ERROR : La ruta especificada no es un directorio!");
            }
        } catch (IOException ex) {
            LOG.log(Level.WARNING, "ERROR PRINT CAPTURE: {0}", ex);
        }
    }
}
