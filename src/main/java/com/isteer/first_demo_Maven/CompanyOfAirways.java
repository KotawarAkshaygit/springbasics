package com.isteer.first_demo_Maven;

public class CompanyOfAirways {

	
	String aereoplan;
	String jet;
	public String getAereoplan() {
		return aereoplan;
	}
	public void setAereoplan(String aereoplan) {
		this.aereoplan = aereoplan;
	}
	public String getJet() {
		return jet;
	}
	public void setJet(String jet) {
		this.jet = jet;
	}
	@Override
	public String toString() {
		return "CompanyOfAirways [aereoplan=" + aereoplan + ", jet=" + jet + "]";
	}
	
}
