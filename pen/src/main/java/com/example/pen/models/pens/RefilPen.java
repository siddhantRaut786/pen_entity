package com.example.pen.models.pens;

import com.example.pen.enums.Colour;
import com.example.pen.models.refils.Refil;

public class RefilPen extends Pen {

    private Refil refil;

    RefilPen(Refil refil) {
        this.refil = refil;
    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }
}
