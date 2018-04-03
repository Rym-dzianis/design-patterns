// ============================================================================
//  File          : ModernFactoryMethodClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.factorymethod;

import java.util.function.Function;

import com.dzianis.patterns.factorymethod.canonical.Document;
import com.dzianis.patterns.factorymethod.canonical.DocumentFactory;
import com.dzianis.patterns.factorymethod.canonical.JsonDocument;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernFactoryMethodClient {
    public static void main(String[] args) {
        DocumentFactory factory = JsonDocument::new;
        printUserDetails(factory.create("USER"));

        Function<String, Document> plainFactory = JsonDocument::new;
        printUserDetails(plainFactory.apply("USER"));
    }

    private static void printUserDetails(Document document) {
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);
    }
}
