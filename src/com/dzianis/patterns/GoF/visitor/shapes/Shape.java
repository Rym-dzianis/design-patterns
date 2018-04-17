package com.dzianis.patterns.GoF.visitor.shapes;

import com.dzianis.patterns.GoF.visitor.visitor.Visitor;

public interface Shape {
    public void move(int x, int y);
    public void draw();
    public String accept(Visitor visitor);
}