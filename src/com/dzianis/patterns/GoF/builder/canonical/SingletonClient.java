// ============================================================================
//  File          : SingletonClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.builder.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class SingletonClient {
    public static void main(String[] args) {
        Cluster cluster = Cluster.runtimeBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();

        cluster = Cluster.storingBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();
    }
}
