package org.jesktop;

public interface ObjectRepository {
    void put(String key, Object data);
    boolean containsKey(String key);
    Object get(String key);
    Object get(String key, ClassLoader classLoader);
}
