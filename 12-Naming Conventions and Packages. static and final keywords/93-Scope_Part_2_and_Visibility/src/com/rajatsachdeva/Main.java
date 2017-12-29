package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {

        // local or private to main method
        String varFour = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        // Cannot access the private member of a class, external to the class
        //innerClass.varThree = 10;

        System.out.println("scopeCheck varOne is " + scopeCheck.getVarOne());
        System.out.println(varFour);
        System.out.println("scopeCheck publicVar is " + scopeCheck.publicVar);

        scopeCheck.timesTwo();
        System.out.println("******************************");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
