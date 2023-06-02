package G02_Wrapper;

public class BoxFactory2 {
    
    public static <Z extends Number> Box<Z> makeBox(Z obj) {
        Box<Z> box = new Box<>();
        box.set(obj);
        BoxFactory.count++;
        return box;
    }

}
