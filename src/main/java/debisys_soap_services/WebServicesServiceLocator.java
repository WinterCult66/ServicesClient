/**
 * WebServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package debisys_soap_services;

public class WebServicesServiceLocator extends org.apache.axis.client.Service implements debisys_soap_services.WebServicesService {

    public WebServicesServiceLocator() {
    }


    public WebServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for rpcrouter
    private java.lang.String rpcrouter_address = "http://localhost:7070/soap/servlet/rpcrouter";

    public java.lang.String getrpcrouterAddress() {
        return rpcrouter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String rpcrouterWSDDServiceName = "rpcrouter";

    public java.lang.String getrpcrouterWSDDServiceName() {
        return rpcrouterWSDDServiceName;
    }

    public void setrpcrouterWSDDServiceName(java.lang.String name) {
        rpcrouterWSDDServiceName = name;
    }

    public debisys_soap_services.WebServices getrpcrouter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(rpcrouter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getrpcrouter(endpoint);
    }

    public debisys_soap_services.WebServices getrpcrouter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            debisys_soap_services.RpcrouterSoapBindingStub _stub = new debisys_soap_services.RpcrouterSoapBindingStub(portAddress, this);
            _stub.setPortName(getrpcrouterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setrpcrouterEndpointAddress(java.lang.String address) {
        rpcrouter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (debisys_soap_services.WebServices.class.isAssignableFrom(serviceEndpointInterface)) {
                debisys_soap_services.RpcrouterSoapBindingStub _stub = new debisys_soap_services.RpcrouterSoapBindingStub(new java.net.URL(rpcrouter_address), this);
                _stub.setPortName(getrpcrouterWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("rpcrouter".equals(inputPortName)) {
            return getrpcrouter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:debisys-soap-services", "webServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:debisys-soap-services", "rpcrouter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("rpcrouter".equals(portName)) {
            setrpcrouterEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
