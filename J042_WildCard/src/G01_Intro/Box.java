package G01_Intro;

public class Box<T> {
    
    protected T obj;

    public Box() {}
    public Box(T obj) {
        this.obj = obj;
    }
    
    public T get()         { return obj; }
    public void set(T obj) { this.obj = obj; }
    @Override
    public String toString() { return obj.toString(); }

}
