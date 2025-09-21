package com.tnsif.Inheritance;

public class Hierarchal {
	public void vehicle() {
		System.out.println("Vehicle class");
	}
}
class car extends Hierarchal{
	public void car1() {
		System.out.println("Vehicle: Car");
	}
}
class bike extends Hierarchal{
	public void bike1() {
		System.out.println("Vehicle: Bike");
	}
}
class cycle extends Hierarchal{
	public void cycl() {
		System.out.println("Vehicle: Cycle");
	}
}
