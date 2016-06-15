/**
 * ProductWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface ProductWSService extends javax.xml.rpc.Service {
    public java.lang.String getProductWSAddress();

    public ws.ProductWS getProductWS() throws javax.xml.rpc.ServiceException;

    public ws.ProductWS getProductWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
