// ============================================================================
//  File          : Event
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.observer.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class Event {
    private final String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
