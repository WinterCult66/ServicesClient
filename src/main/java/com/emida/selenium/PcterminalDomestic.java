
/*
DOMESTIC SELENIUM
 */
package com.emida.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.emida.util.Util;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;

/*NOTA 
RATEPLANS> 44 MB PRODUCTS 
RATEPLANS> 52 Sim Act Fixed Value(RP)_Sim Act Fixed ValueCred
*/



/* @author Kevin*/
public class PcterminalDomestic {

    private static final Logger LOG = Logger.getLogger(PcterminalDomestic.class.getName());
    //static String path = "D:\\Documentos\\Images";
    WebDriver driver = null;

    //METHODS TO EXECUTE
    public Map login_Pin(String user, String password, String url, String folderImg, String folderSelenum) {
        Map<String, Object> result = new HashMap();
        try {
            LOG.log(Level.INFO, "SELENIUM.LOGIN + PIN - START LOGIN PCERMINAL 4.0 {0}");
            System.setProperty("webdriver.chrome.driver", folderSelenum);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            try {
                driver.get(url);
                Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
                login(user, password, folderImg);
                result.put("1", "1");
                Util.takeScreenShot(driver, "3.DashBoardStart", folderImg);
                System.out.println("PINS");
                pin(url, folderImg);
                result.put("1", "2");
                driver.close();
            } catch (Exception e) {
                e.printStackTrace();
                LOG.log(Level.INFO, "SELENIUM.LOGIN + PIN  - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
                // Util.takeScreenShot(driver, "Error1", folderImg);
                driver.quit();
                result.put("0", "0");
            }

        } catch (Exception e) {
            LOG.log(Level.INFO, "SELENIUM.LOGIN + PIN  - ERROR LOGIN PCERMINAL 4.0 {1}", e);
            driver.quit();
            result.put("0", "0");
        }

        return result;
    }

    public Map login_TopUp(String user, String password, String url, String folderImg, String folderSelenum) {
        Map<String, Object> result = new HashMap();
        try {
            LOG.log(Level.INFO, "SELENIUM.LOGIN - START LOGIN PCERMINAL 4.0 {0}");
            System.setProperty("webdriver.chrome.driver", folderSelenum);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            try {
                driver.get(url);
                Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
                login(user, password, folderImg);
                result.put("1", "1");
                Util.takeScreenShot(driver, "3.DashBoardStart", folderImg);
                System.out.println("TOPUP");
                topUp(url, folderImg);
                result.put("1", "2");
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
                LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
                // Util.takeScreenShot(driver, "Error1", folderImg);
                driver.quit();
                result.put("0", "0");
            }

        } catch (Exception e) {
            LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {1}", e);
            driver.quit();
            result.put("0", "0");
        }
        return result;

    }

    public Map login_TopUp_Pin(String user, String password, String url, String folderImg, String folderSelenum) {

        Map<String, Object> result = new HashMap();
        try {
            LOG.log(Level.INFO, "SELENIUM.LOGIN - START LOGIN PCERMINAL 4.0 {0}");
            System.setProperty("webdriver.chrome.driver", folderSelenum);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            try {
                System.out.println("METHOD login_TopUp_Pin");
                driver.get(url);
                Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
                result.put("1", "0");
                login(user, password, folderImg);
                result.put("1", "1");
                Util.takeScreenShot(driver, "3.DashBoardStart", folderImg);
                System.out.println("TOPUP");
                topUp(url, folderImg);
                result.put("1", "2");
                pin(url, folderImg);
                result.put("1", "3");
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
                LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
                Util.takeScreenShot(driver, "1.Error1", folderImg);
                driver.quit();
                result.put("0", "0");
            }

        } catch (Exception e) {
            LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {1}", e);
            driver.quit();
            result.put("0", "0");

        }
        return result;

    }

    public Map onlyLogin(String user, String password, String url, String folderImg, String folderSelenum) {
        LOG.log(Level.INFO, "SELENIUM.LOGIN - START LOGIN PCERMINAL 4.0 {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        Map<String, Object> result = new LinkedHashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            login(user, password, folderImg);
            Util.takeScreenShot(driver, "3.DashBoard", folderImg);
            driver.quit();
            result.put("1", "1");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
            // Util.takeScreenShot(driver, "Error1", folderImg);
            driver.quit();
            result.put("0", "0");
        }
        return result;
    }

    public Map onlyLoginLogout(String user, String password, String url, String folderImg, String folderSelenum) {
        LOG.log(Level.INFO, "SELENIUM.LOGIN + LOGOUT - START LOGIN PCERMINAL 4.0 {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        Map<String, Object> result = new LinkedHashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            loginLogout(user, password, folderImg);
            Util.takeScreenShot(driver, "2.DashBoard", folderImg);
            driver.quit();
            result.put("1", "1");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.log(Level.INFO, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
            // Util.takeScreenShot(driver, "Error1", folderImg);
            driver.quit();
            result.put("0", "0");
        }
        return result;
    }

    public Map activationLycaDom(String user, String password, String url, String folderImg, String sim, String zipCode, String email, String clerk, String folderSelenum) {
        LOG.log(Level.INFO, "SELENIUM - ACTIVATIONS PCERMINAL 4.0 {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        Map<String, Object> result = new LinkedHashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            login(user, password, folderImg);
            result.put("1", "1");
            Util.takeScreenShot(driver, "3.DashBoard", folderImg);
            LOG.log(Level.INFO, "SELENIUM.ACTIVATION.LYCA - ACTIVATION PCERMINAL 4.0  LYCA (WITH PLANS) {0}");
            activationLyca(url, folderImg, sim, zipCode, email, clerk);
            result.put("1", "2");
            driver.quit();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
            // Util.takeScreenShot(driver, "Error1", folderImg);
            driver.quit();
            result.put("0", "0");
        }
        return result;
    }

    public Map activationLocusDom(String user, String password, String url, String folderImg, String esn, String npa, String sPin, String city, String ZipCode, String clerk, String folderSelenium) {
        LOG.log(Level.INFO, "SELENIUM - ACTIVATIONS PCERMINAL 4.0 LOCUS {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenium);
        Map<String, Object> result = new LinkedHashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            result.put("1", "0");
            login(user, password, folderImg);
            result.put("1", "1");
            Util.takeScreenShot(driver, "3.DashBoard", folderImg);
            activationLocus(url, folderImg, esn, npa, sPin, city, ZipCode, clerk);
            result.put("1", "2");
            driver.quit();
        } catch (InterruptedException e) {
            LOG.log(Level.SEVERE, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
            // Util.takeScreenShot(driver, "Error1", folderImg);
            driver.quit();
            result.put("0", "0");
        }
        return result;
    }

    public Map activationLyca_Locus_Dom(String user, String password, String url, String folderImg, String sim, String esn, String npa, String sPin, String city, String zipCode, String email, String clerk, String folderSelenum) {
        LOG.log(Level.INFO, "SELENIUM.LOGIN - ACTIVATIONS PCERMINAL 4.0 {0}");
        System.setProperty("webdriver.chrome.driver", folderSelenum);
        Map<String, Object> result = new LinkedHashMap();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get(url);
            Util.takeScreenShot(driver, "1.OpenPcterminal", folderImg);
            login(user, password, folderImg);
            result.put("1", "1");
            Util.takeScreenShot(driver, "3.DashBoard", folderImg);
            LOG.log(Level.INFO, "SELENIUM.ACTIVATION.LYCA - ACTIVATION PCERMINAL 4.0  LYCA (WITH PLAN) {0}");
            activationLyca(url, folderImg, sim, zipCode, email, clerk);
            result.put("1", "2");
            LOG.log(Level.INFO, "SELENIUM.ACTIVATION.LOCUS - ACTIVATION PCERMINAL 4.0  LOCUS (WITH PLAN) {0}");
            activationLocus(url, folderImg, esn, npa, sPin, city, zipCode, clerk);
            result.put("1", "3");
            driver.quit();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "SELENIUM.LOGIN - ERROR LOGIN PCERMINAL 4.0 {2} FROM TRY INTERNAL", e);
         // Util.takeScreenShot(driver, "Error1", folderImg);
            driver.quit();
            result.put("0", "0");
        }
        return result;
    }

    //METHODS TO CALL
    private void login(String user, String password, String folderImg) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='user']")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
        Util.takeScreenShot(driver, "2.ParametersLogin", folderImg);
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='credit']/a")).click();
    }

    private void loginLogout(String user, String password, String folderImg) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='user']")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
        Util.takeScreenShot(driver, "1.ParametersLogin", folderImg);
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='icons-sideBar']/li[3]/a")).click();
        Util.takeScreenShot(driver, "2.Logout", folderImg);
        driver.findElement(By.xpath("//*[@id='logout']")).click();
    }

    private void pin(String url, String folderImg) throws InterruptedException {
        driver.get(url + "/category/2");
        driver.findElement(By.id("exampleColorDropdown1")).click();
        driver.findElement(By.xpath("//div[@id='category']/div/div/div/div[2]/div/div[2]/div/ul/li[2]")).click();
        Util.takeScreenShot(driver, "7.PinParameters", folderImg);
        driver.findElement(By.xpath("//*[@id='wizard-3']/div/div[3]/a[2]")).click();
        Util.takeScreenShot(driver, "8.LoadPin", folderImg);
        Thread.sleep(3000);
        Util.takeScreenShot(driver, "9.ReceiptPin", folderImg);
        driver.findElement(By.xpath("//*[@id='wizard-3']/div/div[3]/a[3]")).click();
        Thread.sleep(2000);
    }

    private void topUp(String url, String folderImage) throws InterruptedException {
        driver.get(url + "/category/1");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 750);");
        driver.findElement(By.xpath("(//button[@id='exampleColorDropdown1'])[39]")).click();
        driver.findElement(By.xpath("//div[@id='category']/div/div[39]/div/div[2]/div/div[2]/div/ul/li[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("3115657718");
        driver.findElement(By.xpath("//*[@id='phoneNumberConfirm']")).sendKeys("3115657718");
        driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("10");
        Util.takeScreenShot(driver, "4.ParametersTopUp", folderImage);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[2]")).click();
        Util.takeScreenShot(driver, "5.LoadTopUp", folderImage);
        Thread.sleep(4000);
        Util.takeScreenShot(driver, "6.ReceiptTopUp", folderImage);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[3]")).click();
    }

    private void activationLyca(String url, String folderImage, String sim, String ZipCode, String email, String clerk) throws InterruptedException {
        driver.get(url + "/category/25");
        Thread.sleep(3000);
        Util.takeScreenShot(driver, "4.DashboardActivations", folderImage);
        driver.findElement(By.xpath("//*[@id='category']/div[1]/div/div[4]/div/div[2]/div/div/h5/a")).click();
        Util.takeScreenShot(driver, "5.ProductLyca", folderImage);
        driver.findElement(By.xpath("//*[@id='activationsProductTable']/div[1]/div/table/tbody/tr/td[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='plan']")).click();
        driver.findElement(By.xpath("//*[@id='plan']/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='sim']")).sendKeys(sim);
        driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(ZipCode);
        driver.findElement(By.xpath("//*[@id='contactEmail']")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/form/div/div/div[2]/div[1]/div/div[2]/div/div/select/option[2]")).click();
        Util.takeScreenShot(driver, "6.FormLyca", folderImage);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/form/div/div/div[3]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='clerkId']")).sendKeys(clerk);
        Util.takeScreenShot(driver, "7.FeeLyca", folderImage);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[2]")).click();
        Thread.sleep(100);
        Util.takeScreenShot(driver, "8.LoadLyca", folderImage);
        Thread.sleep(50000);
        Util.takeScreenShot(driver, "9.ReceiptLyca", folderImage);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[3]")).click();
//        driver.findElement(By.xpath("//*[@id=\"plan\"]")).click();
    }

    private void activationLocus(String url, String folderImage, String esn, String npa, String sPin, String city, String ZipCode, String clerk) throws InterruptedException {
        driver.get(url + "/category/25");
        Thread.sleep(3000);
        Util.takeScreenShot(driver, "4.DashboardActivations", folderImage);
        driver.get(url + "/activation/carrier/194/products");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='activationsProductTable']/div[1]/div/table/tbody/tr[1]/td[1]")).click();
        Util.takeScreenShot(driver, "5.ProductLocus", folderImage);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='esn']")).sendKeys(esn);
        driver.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys(npa);
        driver.findElement(By.xpath("//*[@id='spiff']")).sendKeys(sPin);
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
        driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(ZipCode);
        driver.findElement(By.xpath("//*[@id='plan']/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='clerkId']")).sendKeys(clerk);
        Util.takeScreenShot(driver, "6.FormLocus", folderImage);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[2]")).click();
        Thread.sleep(100);
        Util.takeScreenShot(driver, "8.LoadLocus", folderImage);
        Thread.sleep(50000);
        Util.takeScreenShot(driver, "9.ReceiptLocus", folderImage);
        driver.findElement(By.xpath("//*[@id='wizard-1']/div/div[3]/a[3]")).click();
    }

}
