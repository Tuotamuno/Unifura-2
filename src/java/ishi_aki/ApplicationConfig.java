
package ishi_aki;

import java.util.Set;


@jakarta.ws.rs.ApplicationPath("")
public class ApplicationConfig extends jakarta.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }


    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ishi_aki.New.class);
        resources.add(ishi_aki.New2.class);
        resources.add(ishi_aki.Reverse.class);
    }
    
}
