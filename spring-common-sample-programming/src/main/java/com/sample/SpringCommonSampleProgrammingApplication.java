package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringCommonSampleProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCommonSampleProgrammingApplication.class, args);
	}
	
	@GetMapping("/")
	public String test() {
		return "Welcome to spring boot rest";
	}
	
	//@GetMapping("/orderDetails")
	@RequestMapping(value = "/orderDetails",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	// @RequestMapping(value = "/orderDetails", method = RequestMethod.GET, produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE )
	public Order getOrderDetails(@ModelAttribute Order order) {
		order.setId(101);
		order.setName("Car");
		order.setPrice(500000);
		return order;
		
	}

}
