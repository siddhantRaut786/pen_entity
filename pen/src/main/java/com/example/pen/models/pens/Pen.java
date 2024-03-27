package com.example.pen.models.pens;

import com.example.pen.enums.Colour;
import com.example.pen.enums.PenType;

public abstract class Pen {
    protected String brand;
    protected int price;
    protected PenType penType;
    public abstract Colour getColour();
    public abstract void write();
}
