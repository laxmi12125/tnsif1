package com.tnsif.Constructor;

	class User {

	    private String username;
	    private int age;

	    // Default constructor
	    public User() {
	        username = "Laxmi";
	        age = 19;
	    }

	    // Parameterized constructor
	    public User(String username , int age) {
	        this.username = username;
	        this.age = age;
	    }

	    public void showDetails() {
	        System.out.println("Username: " + username + ", Age: " + age);
	    }
}
	public class ConstructorOverloading {
		public static void main(String[] args) {
			User u1 = new User(); // uses default constructor
	        User u2 = new User("Navya", 21); // uses parameterized constructor

	        u1.showDetails();
	        u2.showDetails();


		}

		

	}