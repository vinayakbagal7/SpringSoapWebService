package controller;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.axis.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ws.*;

@Controller
//@RequestMapping( value = "/hello")
public class HelloController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/")
	public String printHelloWorld(Model model) {
		return "redirect:index";
	}
	
	@RequestMapping(value = "/hellows", method = RequestMethod.GET)
	public String hellows(ModelMap modelMap) {
		try {
			HelloWSProxy helloWSProxy = new HelloWSProxy();
			modelMap.put("result", helloWSProxy.hello("Vinayak"));
		} catch (Exception e) {
			modelMap.put("result", e.getStackTrace());
		}
		return "hellows";		
	}
	
	@RequestMapping(value = "/sumws", method = RequestMethod.GET)
	public String sumws(ModelMap modelMap) {
		try {
			HelloWSProxy helloWSProxy = new HelloWSProxy();
			modelMap.put("result", helloWSProxy.sum(10, 20));
		} catch (Exception e) {
			modelMap.put("result", e.getStackTrace());
		}
		return "sumws";		
	}
}
