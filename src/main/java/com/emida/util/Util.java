package com.emida.util;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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

    public static DesiredCapabilities evaluatorBrowser(String driverName) {
        DesiredCapabilities capabilities = null;
        if ("Chrome".equalsIgnoreCase(driverName)) {
            capabilities = DesiredCapabilities.chrome();
        } else if ("Explorer".equalsIgnoreCase(driverName)) {
            capabilities = DesiredCapabilities.internetExplorer();
        } else if ("Firefox".equalsIgnoreCase(driverName)) {
            capabilities = DesiredCapabilities.firefox();
        } else {
            capabilities = null;
        }
        return capabilities;
    }

    public static String getNameDriver(int driverNameOption) {
        String driverName = null;
        if (driverNameOption == 0) {
            driverName = "Chrome";
        } else if (driverNameOption == 1) {
            driverName = "Chrome";
        } else {
            driverName = null;
        }
        return driverName;
    }

    public static String getDate2StartThread() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatCalendar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        String stringDate = formatCalendar.format(cal.getTime());
        return stringDate;
    }

    public static String LoginThread(String nameThread) {
        return nameThread;
    }
}
