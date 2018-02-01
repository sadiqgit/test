package com.sadiq.main.GreetingsController.ConfigurationProperties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Spring Boot @ConfigurationProperties is letting developer maps the entire file into an object easily.
 * @author sadiq.basha
 *
 */
@Component

@PropertySources({ 
	@PropertySource("/complex.properties"), 
	@PropertySource ("/complex.yml")// if same key  matches this will win
})
@org.springframework.boot.context.properties.ConfigurationProperties
public class GlobalProperties {
	private String email;
	private String threadPool;
	

	@Override
	public String toString() {
		return "GlobalProperties [email=" + email + ", threadPool=" + threadPool + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getThreadPool() {
		return threadPool;
	}

	public void setThreadPool(String threadPool) {
		this.threadPool = threadPool;
	}

}
