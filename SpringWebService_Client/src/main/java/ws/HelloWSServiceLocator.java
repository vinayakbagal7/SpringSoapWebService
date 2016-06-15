/**
 * HelloWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class HelloWSServiceLocator extends org.apache.axis.client.Service implements ws.HelloWSService {

    public HelloWSServiceLocator() {
    }


    public HelloWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWS
    private java.lang.String HelloWS_address = "http://localhost:8080/SpringWebService_Server/services/HelloWS";

    public java.lang.String getHelloWSAddress() {
        return HelloWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWSWSDDServiceName = "HelloWS";

    public java.lang.String getHelloWSWSDDServiceName() {
        return HelloWSWSDDServiceName;
    }

    public void setHelloWSWSDDServiceName(java.lang.String name) {
        HelloWSWSDDServiceName = name;
    }

    public ws.HelloWS getHelloWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWS(endpoint);
    }

    public ws.HelloWS getHelloWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.HelloWSSoapBindingStub _stub = new ws.HelloWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWSEndpointAddress(java.lang.String address) {
        HelloWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.HelloWS.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.HelloWSSoapBindingStub _stub = new ws.HelloWSSoapBindingStub(new java.net.URL(HelloWS_address), this);
                _stub.setPortName(getHelloWSWSDDServiceName());
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
        if ("HelloWS".equals(inputPortName)) {
            return getHelloWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "HelloWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "HelloWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWS".equals(portName)) {
            setHelloWSEndpointAddress(address);
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
