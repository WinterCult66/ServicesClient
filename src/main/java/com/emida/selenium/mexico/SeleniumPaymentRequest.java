package com.emida.selenium.mexico;

import com.emida.util.Util;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author krodriguez
 */
public class SeleniumPaymentRequest {

    private static final Logger LOG = Logger.getLogger(SeleniumPaymentRequest.class.getName());
    WebDriver driver = null;

    public Map PaymentRequest(String url, String user, String password, String account, String date, String value, String folderImg, String folderSelenum) throws InterruptedException {
        LOG.log(Level.INFO, "SELENIUM PAYMENTREQUEST {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        Map<String, Object> result = new HashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            driver.findElement(By.xpath("//*[@id='user']")).sendKeys(user);
            driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
            Util.takeScreenShot(driver, "2.ParametersLogin", folderImg);
            driver.findElement(By.id("btnSubmit")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='credit']/a")).click();
            Util.takeScreenShot(driver, "3.DashBoard", folderImg);
            driver.get(url + "/paymentWizard");
            Thread.sleep(2000);
            Util.takeScreenShot(driver, "4.FormPaymentRequest", folderImg);
            driver.findElement(By.xpath("//*[@id='invoiceCode']/option[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='bank']/option[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='depositType']/option[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='detail']")).sendKeys(account);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='documentDate']")).sendKeys(date);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='amount']")).sendKeys(value);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='panelPayment']/form/div[2]/div/div/div/div/div/div/div[4]/button")).click();
            Util.takeScreenShot(driver, "5ResponsePaymentRequest", folderImg);
            Thread.sleep(4000);
            result.put("1", "1");
            driver.quit();
        } catch (Exception ex) {
            driver.quit();
            LOG.log(Level.SEVERE, "Error Method PaymentRequest ", ex);
        }
        return result;
    }

}
