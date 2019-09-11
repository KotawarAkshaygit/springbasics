package com.isteer.first_demo_Maven;

import org.springframework.stereotype.Component;

@Component
public class Capacity {

	
	int aeroplanes;
	int jets;

	public int getJets() {
		return jets;
	}

	public void setJets(int jets) {
		this.jets = jets;
	}

	public int getAeroplane() {
		return aeroplanes;
	}

	public void setAeroplane(int aeroplane) {
		this.aeroplanes = aeroplane;
	}

	@Override
	public String toString() {
		return "Capacity [aeroplanes=" + aeroplanes + ", jets=" + jets + "]";
	}


	
	
	
}
