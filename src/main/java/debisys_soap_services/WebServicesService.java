/**
 * WebServicesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package debisys_soap_services;

public interface WebServicesService extends javax.xml.rpc.Service {
    public java.lang.String getrpcrouterAddress();

    public debisys_soap_services.WebServices getrpcrouter() throws javax.xml.rpc.ServiceException;

    public debisys_soap_services.WebServices getrpcrouter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
