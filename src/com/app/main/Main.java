package com.app.main;

import java.util.ArrayList;

import com.app.singleton.SingletonClass;

public class Main {

	public static void main(String[] args) {
		System.err.println("*** Start Main***");
		// create Instance 1
		/*SingletonClass instance1 = SingletonClass.getInstance();
		instance1.setId(1);
		instance1.setValue("instance1");
		System.out.println(instance1.toString(""+instance1.hashCode()));

		// create Instance 2
		SingletonClass instance2 = SingletonClass.getInstance();
		instance2.setId(2);
		instance2.setValue("instance2");
		System.out.println(instance2.toString(""+instance2.hashCode()));

		// create Instance 3
		SingletonClass instance3 = SingletonClass.getInstance();
		instance3.setId(3);
		instance3.setValue("instance3");
		System.out.println(instance3.toString(""+instance3.hashCode()));*/
		
		ArrayList<SingletonClass> lst = new ArrayList<SingletonClass>();
		for(int i = 0 ; i<100; i++){
			SingletonClass Myinstance = SingletonClass.getInstance();
			Myinstance.setId(i);
			Myinstance.setValue("instance"+i);
			System.out.println(Myinstance.toString(""+Myinstance.hashCode()));
		}
	}
}
