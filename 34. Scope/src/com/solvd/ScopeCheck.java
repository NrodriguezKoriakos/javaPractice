package com.solvd;

public class ScopeCheck {

    public int publicVar=0;
    private final int privateVar=1;

    public void scopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " and privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }
}
