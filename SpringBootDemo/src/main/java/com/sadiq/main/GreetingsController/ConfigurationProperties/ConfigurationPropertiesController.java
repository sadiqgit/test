package com.sadiq.main.GreetingsController.ConfigurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesController {
	
	@Autowired
	GlobalProperties globalProperties;
	
	@Autowired
	AppProperties appProperties;
	
	@RequestMapping ("/ConfigurationPropertiesDemo")
	public String ConfigurationPropertiesDemo() {
		
		 String app = appProperties.toString();
	        String global = globalProperties.toString();
	        
	        System.out.println(appProperties.getCompiler().getTimeout());
		return  app + "   "  + global;
	}

	public void setGlobalProperties(GlobalProperties globalProperties) {
		this.globalProperties = globalProperties;
	}

	public void setAppProperties(AppProperties appProperties) {
		this.appProperties = appProperties;
	}
	
	

}
