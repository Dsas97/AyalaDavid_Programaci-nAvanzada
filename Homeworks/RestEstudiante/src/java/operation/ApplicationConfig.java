package operation;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Alexis
 */
@javax.ws.rs.ApplicationPath("operation")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(operation.Search.class);
    }
    
}
