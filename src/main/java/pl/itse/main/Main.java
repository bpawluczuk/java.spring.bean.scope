package pl.itse.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.itse.config.AppConfig;
import pl.itse.prototype.ExampleService;
import pl.itse.prototype.IExampleService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		// Spring bean scopes - prototype

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IExampleService serviceA = context.getBean("scope-prototype", ExampleService.class);

		serviceA.name();

		IExampleService serviceB = context.getBean("scope-prototype", ExampleService.class);

		serviceB.name();

	}
}
