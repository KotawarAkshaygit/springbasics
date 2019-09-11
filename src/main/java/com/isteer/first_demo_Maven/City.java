package com.isteer.first_demo_Maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class City implements Airways{
	 @Autowired
	private Capacity aeroplans;
	
	

	public Capacity getAeroplans() {
		return aeroplans;
	}



	public void setAeroplans(Capacity aeroplans) {
		this.aeroplans = aeroplans;
	}



	public void journey() {
		System.out.println("Aeroplane as a capacity of  "+ aeroplans);
		
	}



	
	
	
	
}
