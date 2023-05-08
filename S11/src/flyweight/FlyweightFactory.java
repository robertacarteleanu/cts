package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}
