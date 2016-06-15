package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ws.*;

@Controller
public class ProductController {

	@RequestMapping( value = "/find", method = RequestMethod.GET)
	public String find(ModelMap modelMap) {
		try {
			modelMap.put("product", new ProductWSProxy().find());
		} catch (Exception e) {
			modelMap.put("product", null);
		}
		return "find";
	}
}
