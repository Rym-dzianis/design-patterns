package com.dzianis.patterns.memento.shapeEditor;

import java.awt.*;

import com.dzianis.patterns.memento.shapeEditor.editor.Editor;
import com.dzianis.patterns.memento.shapeEditor.shapes.Circle;
import com.dzianis.patterns.memento.shapeEditor.shapes.CompoundShape;
import com.dzianis.patterns.memento.shapeEditor.shapes.Dot;
import com.dzianis.patterns.memento.shapeEditor.shapes.Rectangle;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}