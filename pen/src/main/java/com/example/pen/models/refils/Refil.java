package com.example.pen.models.refils;

import com.example.pen.enums.RefilType;
import com.example.pen.models.Ink;
import com.example.pen.models.Nib;

public abstract class Refil {
    private Nib nib;
    private Ink ink;
    private RefilType type;

    Refil(RefilType type) {
        this.type = type;
    }

    public RefilType getType() {
        return type;
    }

    public void setType(RefilType type) {
        this.type = type;
    }
}
