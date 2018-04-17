package com.dzianis.patterns.GoF.visitor;

import com.dzianis.patterns.GoF.visitor.shapes.Circle;
import com.dzianis.patterns.GoF.visitor.shapes.CompoundShape;
import com.dzianis.patterns.GoF.visitor.shapes.Dot;
import com.dzianis.patterns.GoF.visitor.shapes.Rectangle;
import com.dzianis.patterns.GoF.visitor.shapes.Shape;
import com.dzianis.patterns.GoF.visitor.visitor.XMLExportVisitor;

public class Demo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    public static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}