package G01_Intro;
public class BoxFactory {
    
    static int count;
    
    public static <T> Box<T> makeBox(T obj) {
        Box<T> box = new Box<>();
        box.set(obj);
        BoxFactory.count++;
        return box;
    }

    public int getCount() { return BoxFactory.count; }
}
