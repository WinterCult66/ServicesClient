/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emida.selenium.multibrowser;

import com.emida.util.Util;
import com.querydsl.core.Tuple;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author krodriguez
 */
public class MultiSeleniumRecordedTest implements Runnable{

    private static final Logger LOG = Logger.getLogger(MultiSeleniumRecordedTest.class.getName());
    RemoteWebDriver driver = null;
    DesiredCapabilities capabilities = null;
    String driverName;
    String hubURL;
    List<Tuple> listRecorded;
    String folderImage;
    List listOptions;


    @Override
    public void run() {
        try {
            String startTime = Util.getDate2StartThread();
            System.out.println(Thread.currentThread().getName() + " " + "STartTime : " + startTime);
            listOptions = ReadRecordeds();            
            String endTime = Util.getDate2StartThread();
            System.out.println(Thread.currentThread().getName() + " " + "EndTime : " + endTime);
            setListOptions(listOptions);
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "ERROR FROM RUN METHOD ( ) : {0}", ex);
        }
    }

    public List ReadRecordeds() throws MalformedURLException {

        //System.setProperty("webdriver.chrome.driver", folderSelenum);
        capabilities = Util.evaluatorBrowser(driverName);
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);
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
                captureEventInit(option, value, xpath, folderImage);
                listOptions.add(option);
            }
            captureEventInit("6", "", "", "");
        } catch (Exception ex) {
            driver.quit();
            LOG.log(Level.INFO, "Error{0}", ex);
        }
        return listOptions;
    }

    private void captureEventInit(String event, String target, String param, String folderImage) {

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

    public MultiSeleniumRecordedTest(String driverName, String hubURL, List<Tuple> listRecorded, String folderImage, List listOptions) {
        this.driverName = driverName;
        this.hubURL = hubURL;
        this.listRecorded = listRecorded;
        this.folderImage = folderImage;  
        this.listOptions = listOptions;
    }
    
        public List getListOptions() {
        return listOptions;
    }

    public void setListOptions(List listOptions) {
        this.listOptions = listOptions;
    }
}
