package com.company;

import java.awt.*;

public class Bedroom {
    private Bed bed;
    private Table table;
    private WallWindow wallWindow;

    public Bedroom(Bed bed, Table table, WallWindow wallWindow) {
        this.bed = bed;
        this.table = table;
        this.wallWindow = wallWindow;
    }
    public void makeBed(){
        System.out.println("Bedroom-->make bed");
        bed.makeBed();
    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }

    public WallWindow getWallWindow() {
        return wallWindow;
    }
}
