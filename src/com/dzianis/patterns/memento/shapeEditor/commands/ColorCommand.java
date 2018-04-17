package com.dzianis.patterns.memento.shapeEditor.commands;

import java.awt.*;

import com.dzianis.patterns.memento.shapeEditor.editor.Editor;
import com.dzianis.patterns.memento.shapeEditor.shapes.Shape;

public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}