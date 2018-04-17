package com.dzianis.patterns.GoF.state.states;

import com.dzianis.patterns.GoF.state.ui.Player;

/**
 * ќбщий интерфейс всех состо€ний.
 */
public abstract class State {
    public Player player;

    /**
     *  онтекст передаЄт себ€ в конструктор состо€ни€, чтобы состо€ние могло
     * обращатьс€ к его данным и методам в будущем, если потребуетс€.
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}