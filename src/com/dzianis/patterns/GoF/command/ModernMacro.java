// ============================================================================
//  File          : ModernMAcro
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.command;

import java.util.ArrayList;
import java.util.List;

import com.dzianis.patterns.GoF.command.canonical.Command;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernMacro {
    private final List<Command> commands = new ArrayList<>();

    public ModernMacro record(Command action) {
        commands.add(action);
        return this;
    }

    public void run() {
        commands.stream().forEach(Command::execute);
    }
}
