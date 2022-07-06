package com.hamma.main;

import java.util.Date;

/**
 * This class launches the web application in an embedded Jetty container. This
 * is the entry point to your application. The Java command that is used for
 * launching should fire this main method.
 */
public class Main {

	public static void main(String[] args) throws Exception {

		var date = new Date();
		System.out.println("Valeur : "+date.toString()+" --, type: "+date.getClass().getName());
		
		Boolean bo = false;
		Boolean bo1 = false;

		System.out.println("--->" + (bo == bo1));
		bo = true;
		bo1 = true;
		System.out.println("Boolean--->" + (bo == bo1));
		Double d = 100.0;
		Double d1 = 100.0;

		System.out.println("--->" + (d == d1));
		d = 1000.0;
		d1 = 1000.0;
		System.out.println("Double--->" + (d == d1));

		double dd = 100.0;
		double dd1 = 100.0;

		System.out.println("--->" + (dd == dd1));
		dd = 1000.0;
		dd1 = 1000.0;
		System.out.println("double--->" + (dd == dd1));

		Integer a = 100;
		Integer b = 100;

		System.out.println("--->" + (a == b));
		a = 1000;
		b = 1000;
		System.out.println("Integer--->" + (a == b));
		Integer value = 123;                // Auto-boxing
        System.out.println( value.toString() );        // Affiche 123
        
        // Il est même possible d'écrire
        value += 2;
        System.out.println( value.toString() );  

		String s = "100";
		String s1 = "100";

		System.out.println("--->" + (s == s1));
		s = "1000";
		s1 = "1000";
		System.out.println("String--->" + (s == s1));

		int accumulator = 0;

		for (String param : args) {
			accumulator += Integer.parseInt(param);
		}

		String strAccumulator = Integer.valueOf(accumulator).toString();
		System.out.println(strAccumulator);
		
		System.out.println( Byte.MIN_VALUE );
        System.out.println( Byte.MAX_VALUE );

        System.out.println( Short.MIN_VALUE );
        System.out.println( Short.MAX_VALUE );

        System.out.println( Integer.MIN_VALUE );
        System.out.println( Integer.MAX_VALUE );

        System.out.println( Long.MIN_VALUE );
        System.out.println( Long.MAX_VALUE );
	}
}
