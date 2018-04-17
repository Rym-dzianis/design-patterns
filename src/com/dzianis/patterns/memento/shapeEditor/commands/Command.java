package com.dzianis.patterns.memento.shapeEditor.commands;

public interface Command {
    public String getName();
    public void execute();
}