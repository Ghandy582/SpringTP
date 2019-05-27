package fr.cs2i;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigHello {
	@Bean(initMethod = "init", destroyMethod = "destroy" )
	@Value(value = "Hello World")
	@Scope("prototype")
	public HelloWorld HelloWorld() {
		return new HelloWorld();
	}


}
