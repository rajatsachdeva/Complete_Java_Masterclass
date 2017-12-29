package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {

        // local or private to main method
        String privateVar = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck privateVar is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);
        System.out.println("scopeCheck publicVar is " + scopeCheck.publicVar);

        scopeCheck.timesTwo();
        System.out.println("******************************");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
