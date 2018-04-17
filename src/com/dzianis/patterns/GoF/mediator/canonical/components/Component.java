package com.dzianis.patterns.GoF.mediator.canonical.components;

import com.dzianis.patterns.GoF.mediator.canonical.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
}
