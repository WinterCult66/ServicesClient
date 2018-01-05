/*
FACADE LOGIN METHOD LOGIN WEB SERVICES
 */
package com.emida.methods;


/* @author Kevin*/
import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacadeLogin {

    private static final Logger LOG = Logger.getLogger(FacadeLogin.class.getName());

    public String login(String url, String version, String username, String password, String language) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();

        try {
            LOG.log(Level.INFO, "FACADE.LOGIN - START LOGIN SOAP {0}");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            return binding.login(version, username, password, language);

        } catch (Exception e) {
            LOG.log(Level.INFO, "FACADE.LOGIN - ERROR {1}", e);
            return null;
        }

    }

}
