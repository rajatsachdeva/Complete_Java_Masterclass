package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());
        SomeClass two = new SomeClass("two");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());
        SomeClass three = new SomeClass("three");
        System.out.println("Class Counter = " + SomeClass.getClassCounter());

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // Cannot assign value to final variable
        // one.instanceNumber = 5;
        System.out.println(Math.PI);
        // cannot instantiate Math class as constructor is private
        // and fields are public static final, And Math class is marked as final
        // Math m = new Math();

        int pw = 674312;
        Password password = new Password(pw);
//        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(234234);
        password.letMeIn(0);
        password.letMeIn(1);
        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
