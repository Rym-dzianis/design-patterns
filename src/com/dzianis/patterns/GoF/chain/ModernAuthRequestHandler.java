// ============================================================================
//  File          : ModernAuthRequestHandler
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.chain;

import java.util.function.Consumer;

import com.dzianis.patterns.GoF.chain.canonical.Request;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernAuthRequestHandler implements Consumer<Request> {
    private static final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    @Override
    public void accept(Request request) {
        currentUser.set(request.getUserId());
        System.out.println("Current user is set to: " + request.getUserId());
        request.addParam("AUTH_PASSED", "TRUE");
    }

    public static Long getCurrentUser() {
        return currentUser.get();
    }
}
