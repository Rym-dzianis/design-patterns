// ============================================================================
//  File          : AdapterClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.adapter.canonical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;


/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class AdapterClient {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        

        AtomicInteger counter = new AtomicInteger();
        
//        List<String> list = Arrays.asList("af", "bdf", "c");
//        
//        List<CharCounterTask> taskList = new ArrayList<>();
//        
//        for(String item : list){
//        	CharCounterTask task = new CharCounterTask(item, counter);
//        	
//			taskList.add(task);
//        }
//        
//        for(CharCounterTask item : taskList){
//        	Consumer<Runnable> consumer = new ExecutorConsumerAdaptor(executor);
//			
//        	consumer.accept(item);
//        }
        
        Arrays.asList("af", "bdf", "c").stream()
                .map(s -> new CharCounterTask(s, counter))
                .forEach(new ExecutorConsumerAdaptor(executor));

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Total count: " + counter.get());
    }
}
