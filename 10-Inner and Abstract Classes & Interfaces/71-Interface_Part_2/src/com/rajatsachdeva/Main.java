package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        ITelephone rajatsPhone = new DeskPhone(123456);
        rajatsPhone.powerOn();
        rajatsPhone.callPhone(123456);
        rajatsPhone.answer();
        System.out.println("===================");

        rajatsPhone = new MobilePhone(2456789);
        rajatsPhone.callPhone(2456789);
        rajatsPhone.answer();
        rajatsPhone.dial(1212312);
        rajatsPhone.powerOn();
        rajatsPhone.dial(1212312);
        rajatsPhone.callPhone(2456789);
        rajatsPhone.answer();
    }
}
