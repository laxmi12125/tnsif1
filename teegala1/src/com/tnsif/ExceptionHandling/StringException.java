package com.tnsif.ExceptionHandling;

public class StringException {

	int demo[]= new int [3];
	
	public void show() {
		
		 System.out.println(demo[4]);
	
}

	public static void main(String[] args) {
		
		StringException d =new StringException();
		d.show();
		
		


}
}
