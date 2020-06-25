package com.wipro.assignments;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

	@GetMapping("/name")
	public String getBankName() {
		return "ICICI";
	}
	
	@GetMapping("/address")
	public String getBankAddress() {
		return "Shri Kalki Towers Opp Huda Bus Stop, NH65, Chanda Nagar, Hyderabad, Telangana 500050";
	}
	
	@Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }
}
