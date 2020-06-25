package com.wipro.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class BankController {
	
	@RequestMapping("/branchs")
	public String getBranchs() {
		return "branchs";
	}
	
	@RequestMapping("/services")
	public String getServices() {
		return "services";
	}

}
