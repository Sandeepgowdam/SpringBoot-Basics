package com.bootbasic.boot.child;

import org.springframework.stereotype.Component;

@Component
public class carServices {

	public carServices() {
		System.out.println(" child constructor is created");
	}
}
//this is is child package that of base in this package we need not create the bootClass because it extends the base package properties