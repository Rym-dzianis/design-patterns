// ============================================================================
//  File          : UnderlineCommand
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.command.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class UnderlineCommand implements Command {
    private final Editor editor;

    public UnderlineCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.underline();
    }
}
