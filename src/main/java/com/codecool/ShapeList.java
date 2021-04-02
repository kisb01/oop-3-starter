package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {

    List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public Shape getLargest() {
        if (shapes.size() == 0) {
            return null;
        }
        Shape temp = shapes.get(0);
        for (int i = 1; i < shapes.size() -1; i++){
            if (shapes.get(i).getArea() > temp.getArea()) {
                temp = shapes.get(i);
            }
        }
        return temp;
    }

    public String  compareArea(Shape x, Shape y){
        if (x.getArea() == y.getArea()){
            return "Equal areas";
        } else if ( x.getArea() < y.getArea()) {
            return y.speak();
        } else return x.speak();
    }

}
