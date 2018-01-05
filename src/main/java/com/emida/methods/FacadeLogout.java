/*
FACADE LOGOUT METHOD LOGOUT WEB SERVICES
 */
package com.emida.methods;

import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author krodriguez */
public class FacadeLogout {

    private static final Logger LOG = Logger.getLogger(FacadeLogin.class.getName());

    public String logout(String url, String version, String username, String password, String language) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();

        try {
            LOG.log(Level.INFO, "FACADE.LOGOUT - START LOGOUT SOAP {0}");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            return binding.login(version, username, password, language);

        } catch (Exception e) {
            LOG.log(Level.INFO, "FACADE.LOGOUT - ERROR {1}", e);
            return null;
        }

    }

}
