package com.tnsif.second;

public class Variables {
int instanceVar=20;
public void show() {
	int localVar=10;
	System.out.println("local variable: "+localVar);
	System.out.println("instance variable:"+instanceVar);
}
public static void main(String[]args) {
	Variables obj=new Variables();
	obj.show();
}
}
