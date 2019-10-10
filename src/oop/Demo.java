package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk( ) {
		System.out.println(name + " is walking");
	}
	
	void eat( ) {
		System.out.println(email);
	}
	
	void sleep( ) {
		System.out.println(name + " is sleeping");
	}
	
}




public class Demo {

	public static void main(String[] args) {
	    // Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "khalil";
		person1.email = "khalil@gmail";
		person1.phone = "6452155555";
		
		// Abstraction
		person1.walk();
		
		
		///
		
		person1.sleep();
		
		
		
		
		/*
		// Person-
		
		// Attributes, variable, adjectives, descriptors
		String name = "khalil";
		String email = "khalil@gmail.com";
		String phone = "555425585";
		
		// Action, activity, behavior
		// System.out.println(name + "is walking");
		walking(name);
		System.out.println(name + " is eating");
        // What if we wanted to do this for another person
		String name2 = "chrayah";
		String email2 = "chrayah@gmail.com";
		String phone2 = "5545662585";
		
		// Action, activity, behavior
		// System.out.println(name2 + " is eating");
		walking(name2);
		System.out.println(name2 + " is eating");
		
	}
	
	// Enhance by adding function to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}

}
