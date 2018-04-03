// ============================================================================
//  File          : Observer
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.observer.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface Observer {
    void addListener(EventListener listener);
}
