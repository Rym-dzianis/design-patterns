package com.dzianis.patterns.GoF.state;

import com.dzianis.patterns.GoF.state.ui.Player;
import com.dzianis.patterns.GoF.state.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}