// ============================================================================
//  File          : ModernChainClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.chain;

import java.util.Arrays;
import java.util.function.Consumer;

import com.dzianis.patterns.chain.canonical.Request;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        chain(new ModernAuthRequestHandler(), ModernChainClient::log).accept(request);
    }

    @SafeVarargs
    public static Consumer<Request> chain(Consumer<Request>... handlers) {
        return Arrays.asList(handlers).stream()
                .reduce(Consumer::andThen).get();
    }

    private static void log(Request request) {
        System.out.println("Request arrived: " + request);
    }
}
