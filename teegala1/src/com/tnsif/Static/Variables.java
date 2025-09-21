package com.tnsif.Static;

public class Variables {
	 static int count = 0; // shared across all objects

	    public Variables() {
	        count++;
	        System.out.println("Object created. Count: " + count);
	    }

	    public static void main(String[] args) {
	        new Variables();
	        new Variables();
	        new Variables();
	        new Variables();
	    }
}
