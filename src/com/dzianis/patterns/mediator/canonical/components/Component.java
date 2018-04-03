package com.dzianis.patterns.mediator.canonical.components;

import com.dzianis.patterns.mediator.canonical.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
}
