package com.company;

public class WallWindow {
    private int width;
    private int height;
    private boolean hasCurtain;

    public WallWindow(int width, int height, boolean hasCurtain) {
        this.width = width;
        this.height = height;
        this.hasCurtain = hasCurtain;
    }

    public void drawCurtains(){
        System.out.println("Drawing the curtains");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasCurtain() {
        return hasCurtain;
    }
}
