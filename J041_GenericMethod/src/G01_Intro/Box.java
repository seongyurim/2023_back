package G01_Intro;
public class Box<T> {

    private T obj;

    public T get() { return obj; }
    public void set(T obj) { this.obj = obj; }

    @Override
    public String toString() {
        return obj.toString();
    }

}