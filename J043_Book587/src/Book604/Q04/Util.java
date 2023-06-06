package Book604.Q04;

public class Util {

    // 이게 왜 필요한지?
    // private P pair;
    // private K key;
    
    public static <K, V> V getValue(Pair<K, V> pair, K key) {

        // Pair result = new Pair<>(); // 이게 왜 필요한지?

        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        else {
            return null;
        }
    }
}
