package design.patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SingletonBean {
    private static final Map<String, Object> SINGLETONS = new HashMap<>();

    public static synchronized <T> T getInstance(Class<T> clazz, Supplier<T> supplier) {
        String key = clazz.getName();
        if (!SINGLETONS.containsKey(key)) {
            SINGLETONS.put(key, supplier.get());
        }
        return (T) SINGLETONS.get(key);
    }
}
