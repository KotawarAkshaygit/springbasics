package com.isteer.first_demo_Maven;

import org.springframework.stereotype.Component;

@Component
public class Aeroplane implements Airways {
	
	public void journey()
	{
		System.out.println("Takes More time When Compare to Jet");
	}

}
