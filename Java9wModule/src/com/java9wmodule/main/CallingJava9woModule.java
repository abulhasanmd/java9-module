package com.java9wmodule.main;

import com.anotherjava9wmodule.models.Mammal;
import com.java9.main.CallingAnotherJava;

public class CallingJava9woModule {

	public static void main(String[] args) {
		CallingAnotherJava.main(new String[] {});
		Mammal m = new Mammal();
		System.out.println(m.toString());
	}

}
