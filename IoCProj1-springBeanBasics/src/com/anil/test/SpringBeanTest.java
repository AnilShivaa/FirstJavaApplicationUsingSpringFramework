package com.anil.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.anil.beans.WelcomeGreetings;

public class SpringBeanTest {

	public static void main(String[] args) {
		// locate and hold spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/com/anil/cfgs/applicationContext.xml");
		
		//create IOC container which manages life cycle of springbean
		XmlBeanFactory iocContainer=new XmlBeanFactory(res);
		
		//get spring bean class object from spring/IOC container
		Date d=(Date)iocContainer.getBean("dt"); //type casting that create date class object
		
		System.out.println("d object data is::"+d);
		System.out.println("-------------------");
		
		
		WelcomeGreetings myGreetings=(WelcomeGreetings)iocContainer.getBean("wg");
		System.out.println("Welcome"+myGreetings.welcome("Anil"));
		
	}

}
