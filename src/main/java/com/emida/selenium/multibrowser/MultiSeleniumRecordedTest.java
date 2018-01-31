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
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author krodriguez
 */
public class MultiSeleniumRecordedTest implements Runnable {

    private static final Logger LOG = Logger.getLogger(MultiSeleniumRecordedTest.class.getName());
    RemoteWebDriver driver = null;
    DesiredCapabilities capabilities = null;
    String driverName;
    String hubURL;
    List<Tuple> listRecorded;
    String folderImage;
    List listOptions;
    List<Object> objectList = new ArrayList<Object>();
    String startTime, endTime;
    JSONObject jsonObjectInformation = new JSONObject();
    JSONArray jsonObjectInfo2Array = new JSONArray();
    String uniqueIDGroup = UUID.randomUUID().toString();
    List<String> stepByStep = new ArrayList<String>();
    JSONObject jsonObjectStepByStep = new JSONObject();
    JSONArray jsonObjectStepByStep2Array = new JSONArray();
    String uniqueID = UUID.randomUUID().toString();
    int count = 0;
    @Override
    public void run() {
        try {
            try {
                count ++;
                Thread.currentThread().setName("Thread-"+count);
                String threadName = Thread.currentThread().getName();
                LOG.log(Level.INFO, "Thread Start " + threadName);
                startTime = Util.getDate2StartThread();
                LOG.log(Level.INFO, threadName + " Start Time: " + startTime);
                jsonObjectInformation.put("uniqueid", uniqueID);
                jsonObjectInformation.put("uniqueidgroup", uniqueIDGroup);
                jsonObjectInformation.put("driver", driverName);
                jsonObjectInformation.put("startime", startTime);
                LOG.log(Level.INFO, "{0} Start to Read Records", threadName);
                ReadRecordeds();
                LOG.log(Level.FINE, "{0} End to Read Records", threadName);
                endTime = Util.getDate2StartThread();
                jsonObjectInformation.put("endtime", endTime);
                LOG.log(Level.INFO, "{0} End Time: {1}", new Object[]{threadName, endTime});
            } catch (Exception ex) {
                LOG.log(Level.WARNING, "ERROR FROM RUN METHOD INTERN: {0}", ex);
            }
            
            jsonObjectInfo2Array.add(jsonObjectInformation);
            jsonObjectStepByStep.put("uniqueid", uniqueID);
            //jsonObjectStepByStep.put("stepbysetp", stepByStep);
            jsonObjectStepByStep2Array.add(jsonObjectStepByStep);
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "ERROR FROM RUN METHOD EXTERN: {0}", ex);
        }
    }

    private void ReadRecordeds() throws MalformedURLException {

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
                objectList.add(option);
            }
            captureEventInit("6", "", "", "");
        } catch (Exception ex) {
            driver.quit();
            LOG.log(Level.INFO, "Error{0}", ex);
        }

    }

    private void captureEventInit(String event, String target, String param, String folderImage) {

        LOG.log(Level.INFO, "METHOD CAPTURE INFORMATIONS{0}");
        try {
            switch (event) {
                case "1":
                    String first = "Send URL: " + target;
                    LOG.log(Level.INFO, "1). URL:  {0}", target);
                    jsonObjectStepByStep.put("first", first);
                    //stepByStep.add(first);
                    driver.get(target);
                    break;
                case "2":
                    String second = "Send Value: " + target;
                    LOG.log(Level.INFO, "2). Xpath:  {0} SEND KEY : {1}", new Object[]{param, target});
                    //stepByStep.add(second);
                    jsonObjectStepByStep.put("second", second);
                    driver.findElement(By.xpath(param)).sendKeys(target);
                    break;
                case "3":
                    String third = "Click in: " + param;
                    LOG.log(Level.INFO, "3). Xpath:  {0} Click ", param);
                    //stepByStep.add(third);
                    jsonObjectStepByStep.put("third", third);
                    driver.findElement(By.xpath(param)).click();
                    break;
                case "4":
                    LOG.info("4). SLEEP");
                    String fourth = "Sleep Time: " + target;
                    int longest = Integer.parseInt(target);
                    //stepByStep.add(fourth);
                    jsonObjectStepByStep.put("fourth", fourth);
                    Thread.sleep(longest);
                    break;
                case "5":
                    LOG.info("5). TAKE SCREEN ");
                    String fifth = "Take photo: " + target;
                    Util.takeScreenShot(driver, target, folderImage);
                    //stepByStep.add(fifth);
                    jsonObjectStepByStep.put("fifth", fifth);
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

    public MultiSeleniumRecordedTest(String driverName, String hubURL, List<Tuple> listRecorded, String folderImage, List<Object> objectList, JSONArray jsonObjectInfo2Array, JSONArray jsonObjectStepByStep2Array) {
        this.driverName = driverName;
        this.hubURL = hubURL;
        this.listRecorded = listRecorded;
        this.folderImage = folderImage;
        this.objectList = objectList;
        this.jsonObjectInfo2Array = jsonObjectInfo2Array;
        this.jsonObjectStepByStep2Array = jsonObjectStepByStep2Array;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public JSONArray getJsonObjectInfo2Array() {
        return jsonObjectInfo2Array;
    }

    public void setJsonObjectInfo2Array(JSONArray jsonObjectInfo2Array) {
        this.jsonObjectInfo2Array = jsonObjectInfo2Array;
    }

    public String getUniqueIDGroup() {
        return uniqueIDGroup;
    }

    public void setUniqueIDGroup(String uniqueIDGroup) {
        this.uniqueIDGroup = uniqueIDGroup;
    }

    public List<String> getStepByStep() {
        return stepByStep;
    }

    public void setStepByStep(List<String> stepByStep) {
        this.stepByStep = stepByStep;
    }

}
