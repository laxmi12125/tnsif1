package com.tnsif.Finalkey;

public class FinalVariable {
final int MAX_USERS = 1000; // constant

public void showLimit() {
    System.out.println("Max allowed users: " + MAX_USERS);
}

public static void main(String[] args) {
    FinalVariable obj = new FinalVariable();
    obj.showLimit();
    // obj.MAX_USERS = 200;This would cause a compile-time error
}
}