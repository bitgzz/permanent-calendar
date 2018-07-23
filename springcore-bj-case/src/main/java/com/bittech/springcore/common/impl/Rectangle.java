package com.bittech.springcore.common.impl;

import com.bittech.springcore.common.Shape;

/**
 * Author: secondriver
 * Created: 2018/7/9
 */
public class Rectangle implements Shape {
    
    private final double width;
    private final double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double computeArea() {
        return this.getHeight() * this.getWidth();
    }
    
    public double computeSide() {
        return 2 * (this.getHeight() + this.getWidth());
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + this.computeArea() +
                ", side=" + this.computeSide() +
                '}';
    }
}
