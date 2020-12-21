package com.adoger.factory;

import com.adoger.factory.color.Color;
import com.adoger.factory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
