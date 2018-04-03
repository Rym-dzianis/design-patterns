// ============================================================================
//  File          : ModernServiceRegistry
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

import com.dzianis.patterns.singleton.canonical.NamedService;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernServiceRegistry {
    private final Map<String, NamedService> services = new HashMap<>();

    public void register(NamedService service) {
        String name = service.getName();
        System.out.println("Register service with name: " + name);
        services.put(name, service);
    }

    public NamedService getService(String name) {
        return services.get(name);
    }
}
