package com.rajatsachdeva;

public class Main {

    public static void main(String[] args) {
        ITelephone rajatsPhone = new DeskPhone(123456);
        rajatsPhone.powerOn();
        rajatsPhone.callPhone(123456);
        rajatsPhone.answer();
    }
}
