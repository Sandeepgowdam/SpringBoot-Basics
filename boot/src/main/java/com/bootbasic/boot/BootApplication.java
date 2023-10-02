package com.bootbasic.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
		
		//new SpringApplicationBuilder(BootApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}

}


//this is springBoot starter class which is need to run boot application
// in this class there is a 2 main part 1:annotation 2:run method 
//springBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration +ComponentScan
// runMethod is to execute the bootApplication

