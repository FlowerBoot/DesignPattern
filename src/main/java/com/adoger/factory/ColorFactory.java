package com.adoger.factory;

import com.adoger.factory.color.Blue;
import com.adoger.factory.color.Color;
import com.adoger.factory.color.Green;
import com.adoger.factory.color.Red;
import com.adoger.factory.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
