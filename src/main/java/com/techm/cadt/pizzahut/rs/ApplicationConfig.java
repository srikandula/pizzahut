package com.techm.cadt.foodpanda.rs;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author SK69016
 */
@javax.ws.rs.ApplicationPath("rs")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     *
     * @param resources Accept resource classes
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.techm.cadt.foodpanda.rs.MenuResource.class);
        resources.add(com.techm.cadt.foodpanda.rs.filter.CrossOriginResourceSharingFilter.class);
    }

}
