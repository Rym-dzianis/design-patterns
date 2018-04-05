package com.dzianis.patterns.observer.eventSubscription.listeners;

import java.io.File;

public interface EventListener {
    public void update(String eventType, File file);
}