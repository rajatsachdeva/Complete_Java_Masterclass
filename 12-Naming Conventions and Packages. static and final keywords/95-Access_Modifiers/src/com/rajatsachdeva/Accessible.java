package com.rajatsachdeva;

/**
 * Challenge:
 * <p>
 * In the following interface declaration, what is the visibily of:
 * <p>
 * 1. the Accessible interface ?        package-private
 * 2. the int variable SOME_CONSTANT ?  public
 * 3. methodA ?                         public
 * 4. methodB and methodC ?             public
 * <p>
 * All the methods of an interface are automatically public
 * <p>
 * Hint: think back to the lecture on interfaces before answering.
 */


interface Accessible {
    int SOME_CONSTANT = 100;

    public void methodA();

    void methodB();

    boolean methodC();
}
