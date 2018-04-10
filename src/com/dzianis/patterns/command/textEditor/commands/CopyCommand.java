package com.dzianis.patterns.command.textEditor.commands;

import com.dzianis.patterns.command.textEditor.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}