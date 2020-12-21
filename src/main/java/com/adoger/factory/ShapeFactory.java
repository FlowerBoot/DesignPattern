package com.adoger.factory;

import com.adoger.factory.color.Color;
import com.adoger.factory.shape.Circle;
import com.adoger.factory.shape.Rectangle;
import com.adoger.factory.shape.Shape;
import com.adoger.factory.shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
