package G02_FruitBox;

public class Box<T> {
    private T fruit;
    public T get() { return fruit; }
    public void set(T fruit) { this.fruit = fruit; }
}

// 제네릭 사용 전
// public class Box {
//     private Object fruit;
//     public Object get() { return fruit; }
//     public void set(Object fruit) { this.fruit = fruit; }
// }
