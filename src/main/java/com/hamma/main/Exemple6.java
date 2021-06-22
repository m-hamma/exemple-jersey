package com.hamma.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemple6 {

	

	public Exemple6() {
		List<String> languges  = Arrays.asList("c","Python","Java","C++","Visual Basic");
		//languges.add("SQL");
		//languges.forEach(System.out::println);
		languges.sort((l1,l2)-> l1.compareToIgnoreCase(l2));
		Predicate<String> pre = (e) -> e.length()>4;
		languges.stream().filter(pre).forEach(System.out::println);
	}
	

    public static void main(String[] args) throws Exception
    {
    	new Exemple6();
    	
    }

}
