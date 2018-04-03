// ============================================================================
//  File          : TemplateMethodClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        DocumentFactory factory = new JsonDocumentFactory();
        Document document = factory.create("USER");
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);
    }
}
