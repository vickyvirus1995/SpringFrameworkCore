package com.vicky.AnnotationHelloWorld.POJO;

import org.springframework.stereotype.Component;

@Component("helloobj")
public class Hello {
	
	
	public void show()
	{
		System.out.println("Hello World");
	}

}
