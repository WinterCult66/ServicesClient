//MAIN CLASS
package com.emida.webservice;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

/* @author krodriguez */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws TransformerConfigurationException, ParserConfigurationException, IOException, InterruptedException {

    }
}

//        SeleniumDynamic s = new SeleniumDynamic();
//        File fichero = new File ("C:\\Users\\krodriguez\\Desktop\\test.csv");
//        s.ReadFile(fichero, "D:\\Slenium\\chromedriver_win32\\chromedriver.exe", "D:\\Images\\img");
//EXAMPLE
//PcterminalDomestic pc = new PcterminalDomestic();
//        Map a = pc.activationLocusDom("C9H13N", "1234", "http://192.168.2.52:8888", "D:\\Images\\img","456","235","45456","Bogota","92610","1234", "D:\\Slenium\\chromedriver_win32\\chromedriver.exe");
//        Object value = a.get("1");
//        System.out.println(value);    
//            SeleniumPaymentRequest sp = new SeleniumPaymentRequest();
//            Map a = sp.PaymentRequest("http://192.168.2.47:8888", "diafana", "1234","6514165165156156","22/11/2017","16", "D:\\Images\\img","D:\\Slenium\\chromedriver_win32\\chromedriver.exe");
//            System.out.println("RESULT : " +a );
//        String driverName = null;
//        LoginThread loginThread = null;
//
//        try {
//            for (int i = 0; i < 2; i++) {
//                driverName = Util.getNameDriver(i);
//                LoginThread thread = new LoginThread("http://localhost:4444/wd/hub", "http://192.168.2.47:8888/login", driverName);
//                thread.setName("Thread - " + driverName);                
//                thread.start();             
//                Thread.currentThread().join();
//                System.out.println("hread fuera");
//            }
//        } catch (Exception ex) {
//            System.out.println("LOG EX " + ex);
//        }
//    }
