// ============================================================================
//  File          : ModernText
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.iterator;

import java.util.stream.Stream;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface ModernText {
    Stream<String> linesStream();
}
