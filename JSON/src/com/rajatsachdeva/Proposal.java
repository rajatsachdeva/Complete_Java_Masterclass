package com.rajatsachdeva;

import java.util.Map;

public class Proposal {

    private Map<String, Map<String, String>> Buys;

    public Map<String, Map<String, String>> getBuys() {
        return Buys;
    }

    public void setBuys(Map<String, Map<String, String>> buys) {
        Buys = buys;
    }

    @Override
    public String toString() {
        return "Proposal{" +
                "Buys=" + Buys +
                '}';
    }
}
