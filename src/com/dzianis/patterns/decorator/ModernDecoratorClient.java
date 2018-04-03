// ============================================================================
//  File          : ModernDecoratorClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.decorator;

import java.util.function.Function;

import com.dzianis.patterns.decorator.canonical.DigitCounter;
import com.dzianis.patterns.decorator.canonical.NaiveDigitCounter;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernDecoratorClient {
    public static void main(String[] args) {
        DigitCounter counter = wrap(new NaiveDigitCounter());
        int digitsCount = counter.count("fd6j78fh19kj");
        System.out.println(digitsCount + " digits found");

        Function<String, String> trimmer = String::trim;
        digitsCount = trimmer.andThen(new NaiveDigitCounter()::count).apply(" \n 123 \t");
        System.out.println(digitsCount + " digits found");
    }

    public static DigitCounter wrap(DigitCounter counter) {
        return s -> {
            long startTime = System.currentTimeMillis();
            int count = counter.count(s);
            long endTime = System.currentTimeMillis();
            System.out.println("Counting took " + (startTime - endTime) + " ms");
            return count;
        };
    }
}
