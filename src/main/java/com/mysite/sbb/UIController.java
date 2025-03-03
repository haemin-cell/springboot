package com.mysite.sbb;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {
	
	@Autowired
    private ProductService productService;
	
	@RequestMapping(value="/th")
	public String templatePage(Model model) {
		model.addAttribute("message", "부트 템플릿 입니다.!!");
		return "th";
	}
	
	@RequestMapping(value="/th2")
	public String templatePage2(Model model) {
		Map<String, Object>pageMap = new HashMap();
		pageMap.put("color", "red");
		pageMap.put("name", "jam");
		pageMap.put("price", 3000);
		model.addAttribute("product", pageMap);
		return "th2";
	}
	
	@RequestMapping(value="/th3")
	public String templatePage3(Model model) {
		model.addAttribute("products", productService.getProductList());
		return "th3";
	}
}
