package com.sadiq.main.GreetingsController.PropertySource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("/empolyee.properties")
public class PropertySourceDemo {
	
	public static final Logger LOGGER = Logger.getLogger(PropertySourceDemo.class);
	@Value("${empolyee.email}")
	String empEmail;

	@RequestMapping("/propertySourceDemo")
	public String propertySource() {
		LOGGER.debug("Inside propertySourceDemo");
		return empEmail;
	}

}
