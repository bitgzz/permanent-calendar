package com.bittech.springcore.xml;

import com.bittech.springcore.common.Shape;

/**
 * Author: secondriver
 * Created: 2018/7/9
 */
public class XmlShapeCompute {
    
    private Shape circular;
    
    private Shape triangle;
    
    private Shape rectangle;
    
    public Shape computeShape(String shapeName) {
        if (shapeName == null || shapeName.length() == 0) {
            throw new IllegalArgumentException("Not found shape");
        }
        if (shapeName.equals("circular")) {
            return circular;
        }
        if (shapeName.equals("triangle")) {
            return triangle;
        }
        if (shapeName.equals("rectangle")) {
            return rectangle;
        }
        throw new IllegalArgumentException("Not found shape " + shapeName);
    }
    
    public Shape getCircular() {
        return circular;
    }
    
    public void setCircular(Shape circular) {
        this.circular = circular;
    }
    
    public Shape getTriangle() {
        return triangle;
    }
    
    public void setTriangle(Shape triangle) {
        this.triangle = triangle;
    }
    
    public Shape getRectangle() {
        return rectangle;
    }
    
    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }
}
