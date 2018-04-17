// ============================================================================
//  File          : LoggingRequestHandler
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.chain.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class LoggingRequestHandler extends AbstractRequestHandler {
	
	// конструктор
    public LoggingRequestHandler(RequestHandler next) {
        super(next);
    }

    // выполняемая работа
    @Override
    public void handleRequest(Request request) {
        System.out.println("Request arrived: " + request);
        passToTheNext(request);
    }
}
