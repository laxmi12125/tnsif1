package com.tnsif.Finalkey;

final class SecureData {
    public void display() {
        System.out.println("Secure data access.");
    }
}


public class FinalClass {
	
    public static void main(String[] args) {
        SecureData sd = new SecureData();
        sd.display();
    }
}
