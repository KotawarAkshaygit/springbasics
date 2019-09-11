package com.isteer.first_demo_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
       
      // Airways air=(Airways)cont.getBean("jet");
     //  air.journey();
       
    /*   Capacity capa=(Capacity) cont.getBean("capacity");
       capa.setAeroplane(250);
       capa.setJets(9);
      // System.out.println("capacity of aeroplane is :"+capa.getAeroplane());
       System.out.println("capacity of jet is : "+capa.getJets());
       
       */
       
       CompanyOfAirways ca=(CompanyOfAirways) cont.getBean("companyOfAero");
       
       System.out.println("Company Of Aeroplane is:"+ca.getAereoplan());
       System.out.println("Company of jet is:"+ ca.getJet());
       //System.out.println("company Of Jet is"+ca.getJet());
       
       City city=(City) cont.getBean("city");
       
    //   city.setAeroplans(210);
       System.out.println(city.getAeroplans());
       
       
       
       
    }
}
