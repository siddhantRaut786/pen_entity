package com.example.pen.models.pens;

import com.example.pen.enums.Colour;
import com.example.pen.models.Ink;
import com.example.pen.models.Nib;

public class FountainPen extends Pen {

    private Nib nib;
    private Ink ink;

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }
}
