package G02_FruitBox;

public class Box<T> {
    private T fruit;

    public void set(T fruit) {
        this.fruit = fruit;
    }

    public T get() {
        return fruit;
    }
}
