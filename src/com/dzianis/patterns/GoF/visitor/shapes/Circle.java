package com.dzianis.patterns.GoF.visitor.shapes;

import com.dzianis.patterns.GoF.visitor.visitor.Visitor;

public class Circle extends Dot {
    public int radius;

    public Circle(int id, int x, int y, int radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}