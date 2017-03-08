package pl.itse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import pl.itse.prototype.ExampleService;
import pl.itse.prototype.IExampleService;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="pl.itse.prototype")
public class AppConfig {

	@Bean("scope-prototype")	
	@Scope("prototype")
	public IExampleService exampleService(){
		return new ExampleService();
	}

}
