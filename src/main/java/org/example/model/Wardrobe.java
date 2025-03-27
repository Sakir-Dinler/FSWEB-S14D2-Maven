package org.example.model;

public class Wardrobe {

    private int width;

    private int height;

    private double weigh;

    public Wardrobe(int width, int height, double weigh) {
        this.width = width;
        this.height = height;
        this.weigh = weigh;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weigh;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
