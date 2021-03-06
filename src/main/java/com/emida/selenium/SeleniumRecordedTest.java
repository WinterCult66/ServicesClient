package com.emida.selenium;

import com.emida.util.Util;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.querydsl.core.Tuple;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/* @author Kevin*/
public class SeleniumRecordedTest {

    private static final Logger LOG = Logger.getLogger(SeleniumRecordedTest.class.getName());

    WebDriver driver = null;

    public List ReadRecordeds(List<Tuple> listRecorded, String folderImage, String folderSelenum) {

        System.setProperty("webdriver.chrome.driver", folderSelenum);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        List listOptions = new ArrayList();
        try {
            for (Tuple item : listRecorded) {
                Object oXpath = item.toArray()[0];
                Object oOption = item.toArray()[1];
                Object oValue = item.toArray()[2];
                String xpath = String.valueOf(oXpath);
                String option = String.valueOf(oOption);
                String value = String.valueOf(oValue);
                captureEvent(option, value, xpath, folderImage);  
                listOptions.add(option);
            }
            captureEvent("6", "", "", "");
        } catch (Exception ex) {
            driver.quit();
            LOG.log(Level.INFO, "Error{0}", ex);
        }
        return listOptions;
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
                    driver.findElement(By.xpath(param)).sendKeys(target);
                    break;
                case "3":
                    LOG.log(Level.INFO, "3). Xpath:  {0} Click ", target);
                    driver.findElement(By.xpath(param)).click();
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
