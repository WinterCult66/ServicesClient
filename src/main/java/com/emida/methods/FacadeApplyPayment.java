/*
FACADE APPLYPAYMENT METHOD APPLY PAYMENT WEB SERVICES
 */
package com.emida.methods;

import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Kevin */
public class FacadeApplyPayment {

    private static final Logger LOG = Logger.getLogger(FacadeApplyPayment.class.getName());

    public String applyPayment(String url, String version, String merchantid, String amount, String description, String refnumber, String username, String password) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();

        try {
            LOG.log(Level.INFO, "FACADE.APPLYPAYMENT - START APPLYPAYMENT SOAP {0}");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            return binding.applyPayment(version, merchantid, amount, description, refnumber, username, password);

        } catch (Exception e) {
            LOG.log(Level.INFO, "FACADE.APPLYPAYMENT - ERROR {1}", e);
            return null;
        }

    }

}
