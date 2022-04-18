package com.solvd;

public class Main {

    public static void main(String[] args) {

        String privateVar = "This is private";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope instance private var = " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
    }
}
