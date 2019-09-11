package com.isteer.first_demo_Maven;

import org.springframework.stereotype.Component;

@Component
public class Jet implements Airways{

	public void journey() {
		System.out.println("Jet is faster than Aeroplane");
		
	}

}
