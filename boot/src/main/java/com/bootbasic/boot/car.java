package com.bootbasic.boot;

import org.springframework.stereotype.Component;

@Component // if we wont use this annotation then it will be consider as the normal java class 
           // so by using the component annotation so we are saying to bootClass(BootApplication.java) this class is springBean
            
public class car {

	public car() {
		System.out.println("constructor is created hi");
	}
}

//this package com.bootbasic.boot is basePackage if the package contain bootClass then only it eligible to run the application 
