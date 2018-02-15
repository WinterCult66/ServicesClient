/*
FACADE LOGIN2 METHOD LOGIN WEB SERVICES
 */
package com.emida.methods;


/* @author Kevin*/
import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacadeLogin2 {

    private static final Logger LOG = Logger.getLogger(FacadeLogin.class.getName());

    public String login2(String url, String version, String username, String password, String language) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();
        try {
            LOG.log(Level.INFO, "Facade Login2 - Start");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            LOG.log(Level.INFO, "Facade Login2 - End Success");
            return binding.login2(version, username, password, language);

        } catch (Exception e) {
            LOG.log(Level.INFO, "Facade Login2 -Error ", e);
            return null;
        }
    }

}
