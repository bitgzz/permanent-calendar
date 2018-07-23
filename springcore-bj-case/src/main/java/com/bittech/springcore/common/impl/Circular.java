package com.bittech.springcore.common.impl;

import com.bittech.springcore.common.Shape;

/**
 * Author: secondriver
 * Created: 2018/7/9
 */
public class Circular implements Shape {
    
    private final double radius;
    
    public Circular(double radius) {
        this.radius = radius;
    }
    
    public double computeArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
    
    public double computeSide() {
        return 2 * Math.PI * this.getRadius();
    }
    
    public double getRadius() {
        return radius;
    }
    
    
    @Override
    public String toString() {
        return "Circular{" +
                "radius=" + radius +
                ", area=" + this.computeArea() +
                ", side=" + this.computeSide() +
                '}';
    }
}
