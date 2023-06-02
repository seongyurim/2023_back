package Book604.Q03;

public class Container<K extends Number, V> {
    
    public K key;   // 정수값
    public V value; // 아무거나 // 이렇게 하려면 선언부를 어떻게 바꿔야 할까?

    public Container() {}

    public Container(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey()   {return this.key;}
    public V getValue() {return this.value;}
}
