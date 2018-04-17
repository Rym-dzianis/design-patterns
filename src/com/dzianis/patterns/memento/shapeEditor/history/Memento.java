package com.dzianis.patterns.memento.shapeEditor.history;

import com.dzianis.patterns.memento.shapeEditor.editor.Editor;

public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
