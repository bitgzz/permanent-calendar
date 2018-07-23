package com.bittech.springcore.common.impl;

import com.bittech.springcore.common.Shape;

/**
 * Author: secondriver
 * Created: 2018/7/9
 */
public class Triangle implements Shape {
    
    private final double a;
    private final double b;
    private final double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double computeArea() {
        double q = (this.computeSide()) / 2;
        double s = Math.sqrt(
                (q - a) * (q - b) * (q - c) * q
        );
        return s;
    }
    
    public double computeSide() {
        return this.getA() + this.getB() + this.getC();
    }
    
    public double getB() {
        return b;
    }
    
    public double getC() {
        return c;
    }
    
    public double getA() {
        return a;
    }
    
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + this.computeArea() +
                ", side=" + this.computeSide() +
                '}';
    }
}
