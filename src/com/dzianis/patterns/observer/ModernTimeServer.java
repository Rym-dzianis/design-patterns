// ============================================================================
//  File          : ModernTimeServer
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dzianis.patterns.observer.canonical.Event;
import com.dzianis.patterns.observer.canonical.EventListener;
import com.dzianis.patterns.observer.canonical.Observer;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernTimeServer implements Observer {
    private static final String TIME_FORMAT = "HH:mm:ss";

    private final List<EventListener> listeners = new ArrayList<>();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void reportTime() {
        Event event = new Event(new SimpleDateFormat(TIME_FORMAT).format(new Date()));
        listeners.stream().forEach(listener -> listener.onEvent(event));
    }
}
