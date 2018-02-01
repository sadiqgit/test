package com.sadiq.main.GreetingsController.PropertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@PropertySource({ 
	"/empolyee.properties", 
	"/student.properties" // if same key  matches this will win
})*/

@PropertySources({ 
	@PropertySource("/empolyee.properties"), 
	@PropertySource ("/student.properties")// if same key  matches this will win
})

public class PropertySourcesDemo {
	@Value("${empolyee.email}")
	String email;
	@Value("${student.name}")
	String name;

	@RequestMapping("/propertySourcesDemo")
	public String propertySources() {
		return "Name : " + name  + " " + "Email :" + email;
	}

}
