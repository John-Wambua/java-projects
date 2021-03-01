package com.company;

public class Printer {
    private int tonerLevel=-1;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel>=0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int fillToner(int inkAmount){
        if (inkAmount>0&&inkAmount<=100) {
            if (this.tonerLevel + inkAmount >100) {
                return -1;
            }
            this.tonerLevel += inkAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }
    public int print(int pages){

        if (this.isDuplex){
            pages = (pages/2) + (pages%2);
            System.out.println("Printing Pages in Duplex");
        }
        this.pagesPrinted+=pages;
        return pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
