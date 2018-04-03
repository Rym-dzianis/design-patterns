package com.xpinjection.patterns.mediator.canonical.components;

import com.xpinjection.patterns.mediator.canonical.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
}
