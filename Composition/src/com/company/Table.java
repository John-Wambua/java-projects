package com.company;

public class Table {
    private int width;
    private int height;
    private String color;

    public Table(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void moveTable(){
        System.out.println("Moving the table");
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
