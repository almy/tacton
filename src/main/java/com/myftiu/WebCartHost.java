package com.myftiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author by ali myftiu on 09/10/14.
 */


@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages ={ "com.myftiu" })

public class WebCartHost
{


	public static void main(String[] args) throws Exception
	{
		SpringApplication springApplication = new SpringApplication(WebCartHost.class);
		springApplication.run(args);
	}





}
