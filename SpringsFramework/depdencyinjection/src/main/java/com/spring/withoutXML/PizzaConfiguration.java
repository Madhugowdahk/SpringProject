package com.spring.withoutXML;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//this is bcz we are doing without xml file we have to do it in java class so you need to give @configuration
@Configuration
@ComponentScan(basePackages="com.spring.withoutXML")
public class PizzaConfiguration {
	@Bean(name={"a","b","c","d"})
public Pizza getpizza()
{
	Pizza p=new Pizza();
	return p;
}
	
}

