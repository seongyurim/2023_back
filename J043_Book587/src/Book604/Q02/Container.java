package Book604.Q02;

public class Container<T extends Object> {
// extends Object로 제한을 해야 했다. 왜..?!ㅠㅠ
// 

    public T obj;
    public Container() {}
    public Container(T obj) {this.obj = obj;}
    public void set(T obj) {this.obj = obj;}
    public T get() {return obj;}
}
