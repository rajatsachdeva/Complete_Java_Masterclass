package com.rajatsachdeva;


// Only methods will be defined
public interface ITelephone {

    public void powerOn ();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
