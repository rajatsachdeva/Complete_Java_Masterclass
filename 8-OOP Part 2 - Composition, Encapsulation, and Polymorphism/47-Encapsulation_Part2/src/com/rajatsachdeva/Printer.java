package com.rajatsachdeva;

public class Printer {
    private int tonerLevel = -1;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public void fillUpPrinter() {
        tonerLevel = 100;
        System.out.println("Toner level filling to " + tonerLevel + "%");
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                System.out.println(String.format("addToner: Toner Overflow(%d)!", this.tonerLevel + tonerAmount));
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }

        if(tonerLevel - pages >= 0) {
            numberOfPagesPrinted += pagesToPrint;
            System.out.println("Printing...");
            tonerLevel -= pages;
        } else {
            System.out.println("Cannot Print " + pages +" pages.Toner Level Low. Need refill");
            pagesToPrint = 0;
        }
        return pagesToPrint;
    }


    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
            System.out.println("tonerLevel = " + tonerLevel + " is invalid. Init with default =-1");
        }
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
