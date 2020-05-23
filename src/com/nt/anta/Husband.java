package com.nt.anta;

import org.springframework.stereotype.Component;

@Component("hu")
public class Husband {
	
	
	public Husband() {
		System.out.println("Husband.Husband():constructor");
	}

	public void Show() {
		System.out.println("Its targeg");
	}

}
