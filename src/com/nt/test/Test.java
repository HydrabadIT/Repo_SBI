package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.anta.Husband;

public class Test {

	public static void main(String[] args) {
    
		//crate ioc container
	  ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/conf/aplicationContext.xml");
	  Husband hus=ctx.getBean("hu",Husband.class);
	  hus.Show();

	}

}
