package com.emida.selenium;

import com.emida.util.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/* @author Kevin*/
public class SeleniumDynamic {

    private static final Logger LOG = Logger.getLogger(SeleniumDynamic.class.getName());

    PcterminalDomestic pc = new PcterminalDomestic();
    WebDriver driver = null;

    public void ReadFile(File csvFile, String folderSelenum, String folderImage) {
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] ctry = line.split(csvSplitBy);
                String event = ctry[0];
                String target = ctry[1];
                String param = ctry[2];
                captureEvent(event, target, param, folderImage);
            }
        } catch (IOException e) {
            LOG.log(Level.WARNING, "ERROR READFILE: {0}QUIT DRIVER!!!", e);
            driver.quit();
        }
    }

    public void captureEvent(String event, String target, String param, String folderImage) {

        LOG.log(Level.INFO, "METHOD CAPTURE INFORMATIONS{0}");
        try {
            switch (event) {
                case "1":
                    LOG.log(Level.INFO, "1). URL:  {0}", target);
                    driver.get(target);
                    break;
                case "2":
                    LOG.log(Level.INFO, "2). Xpath:  {0} SEND KEY : {1}", new Object[]{target, param});
                    driver.findElement(By.xpath(target)).sendKeys(param);
                    break;
                case "3":
                    LOG.log(Level.INFO, "3). Xpath:  {0} Click ", target);
                    driver.findElement(By.xpath(target)).click();
                    break;
                case "4":
                    LOG.info("4). SLEEP");
                    int longest = Integer.parseInt(target);
                    Thread.sleep(longest);
                    break;
                case "5":
                    LOG.info("5). TAKE SCREEN ");
                    Util.takeScreenShot(driver, target, folderImage);
                    break;
                case "6":
                    LOG.info("6). CLOSE ");
                    driver.quit();
                    break;
                case "":
                    LOG.info("EMPTY");
                    driver.quit();
                    break;
            }
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "ERROR FROM CAPTURE EVENT METHOD ( ) : {0}", ex);
            driver.quit();
        }
    }

}
