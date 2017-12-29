package com.rajatsachdeva;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        // local variable declared in method
        // scope is local to this method
        // java will consider this declaration over class member named as privateVar
        // but if we remove following declaration then it will take member as default
        int privateVar = 2;

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);

            // Now if we want to use the class member privateVar then to qualify the scope we need to use 'this'
            //System.out.println(i + " times one is " +  i * this.privateVar);
        }

        // i has local scope to for loop and cannot be accessed outside the loop so if we try following then it will
        // error out, i.e. will not compile, as symbol i cannot be resolved outside the code block (for loop)
        //System.out.println("Value of i is now " + i);
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
            int privateVar = 2;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * privateVar);
            }
        }
    }
}
