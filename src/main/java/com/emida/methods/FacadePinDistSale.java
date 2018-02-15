/*
FACADE PINDISTSALE METHOD SALE WEB SERVICES
 */
package com.emida.methods;

import debisys_soap_services.RpcrouterSoapBindingStub;
import debisys_soap_services.WebServicesServiceLocator;
import java.util.logging.Level;
import java.util.logging.Logger;

/*@author Kevin */
public class FacadePinDistSale {

    private static final Logger LOG = Logger.getLogger(FacadePinDistSale.class.getName());

    public String pinDistSale(String url, String version, String terminalid, String clerkid, String productid, String accountid, String amount, String invoiceno, String language) {

        WebServicesServiceLocator locator = new WebServicesServiceLocator();

        try {
            LOG.log(Level.INFO, "Facade  PindistSale Start");
            locator.setEndpointAddress("rpcrouter", url);
            RpcrouterSoapBindingStub binding = (RpcrouterSoapBindingStub) locator.getrpcrouter();
            LOG.log(Level.INFO, "Facade  PindistSale End Success");
            return binding.pinDistSale(version, terminalid, clerkid, productid, accountid, amount, invoiceno, language);
        } catch (Exception e) {
            LOG.log(Level.INFO, "Facade  PindistSale - ERROR: ", e);
            return null;
        }

    }

}
