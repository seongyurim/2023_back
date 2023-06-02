package G02_Wrapper;
public class Box<T extends Number> {

    private T obj;

    public T get() { return obj; }
    public void set(T obj) { this.obj = obj; }

    @Override
    public String toString() {
        return obj.toString();
    }

}