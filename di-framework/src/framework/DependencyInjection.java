package framework;

import java.util.HashMap;

public class DependencyInjection {

    private static HashMap<Class, IElement> dictionary = new HashMap<>();

    public static <T, K> void addTransient(Class<T> dependency, Class<K> implementation) {
        dictionary.put(dependency, new Element(implementation, Types.newInstance));
    }

    public static <T, K> void addSingleton(Class<T> dependency, Class<K> implementation) {
        dictionary.put(dependency, new Element(implementation, Types.singleton));
    }

    public static <T> T resolve(Class<T> dependecy) {

        return (T) dictionary.get(dependecy).getElement();
    }
}
