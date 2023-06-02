package G04_Inheritance;

// public class Box<T extends Number> {
public class Box<T> {
    
    protected T obj;
    // 의미상 protected로 해보았다.
    // SteelBox가 다른 패키지에 있을 수도 있으므로(?)

    public Box() {}
    public Box(T obj) {
        this.obj = obj;
    }
    
    public T get()         { return obj; }
    public void set(T obj) { this.obj = obj; }
    @Override
    public String toString() { return obj.toString(); }

}
