/*
FACADE APPLYPAYMENTAGENTLEVEL METHOD APPLY PAYMENT WEB SERVICES
 */
package com.emida.methods;

import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Kevin */
public class FacadeApplyPaymentAgentLevel {

    private static final Logger LOG = Logger.getLogger(FacadeApplyPayment.class.getName());

    public String applyPaymentAgentLevel(String url, String version, String merchantid, String amount, String description, String refnumber, String username, String password) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();

        try {
            LOG.log(Level.INFO, "FACADE.APPLYPAYMENT - START APPLYPAYMENTAGENTLEVEL SOAP {0}");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            return binding.applyPaymentAgentLevel(version, merchantid, amount, description, refnumber, username, password);

        } catch (Exception e) {
            LOG.log(Level.INFO, "FACADE.APPLYPAYMENTAGENTLEVEL - ERROR {1}", e);
            return null;
        }

    }

}
