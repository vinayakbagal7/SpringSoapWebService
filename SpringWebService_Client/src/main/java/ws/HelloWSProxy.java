package ws;

public class HelloWSProxy implements ws.HelloWS {
  private String _endpoint = null;
  private ws.HelloWS helloWS = null;
  
  public HelloWSProxy() {
    _initHelloWSProxy();
  }
  
  public HelloWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWSProxy();
  }
  
  private void _initHelloWSProxy() {
    try {
      helloWS = (new ws.HelloWSServiceLocator()).getHelloWS();
      if (helloWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWS != null)
      ((javax.xml.rpc.Stub)helloWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.HelloWS getHelloWS() {
    if (helloWS == null)
      _initHelloWSProxy();
    return helloWS;
  }
  
  public int sum(int a, int b) throws java.rmi.RemoteException{
    if (helloWS == null)
      _initHelloWSProxy();
    return helloWS.sum(a, b);
  }
  
  public java.lang.String hello(java.lang.String name) throws java.rmi.RemoteException{
    if (helloWS == null)
      _initHelloWSProxy();
    return helloWS.hello(name);
  }
  
  
}