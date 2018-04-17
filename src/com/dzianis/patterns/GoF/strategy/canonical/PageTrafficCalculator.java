// ============================================================================
//  File          : PageTrafficCalculator
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.strategy.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class PageTrafficCalculator implements TrafficCalculator {
    private static final int PAGE_SIZE = 10;

    @Override
    public int calculate(Position position) {
        int rank = position.getRank();
        if (rank < 0) {
            return 0;
        }
        int page = rank / PAGE_SIZE;
        return position.getMediaValue() / (PAGE_SIZE * (page + 1));
    }
}
