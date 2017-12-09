package com.rajatsachdeva;


// Only methods will be defined
// only signature of methods is written here
// actual definition will be in class
public interface ITelephone {

    void powerOn ();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
