package G02_Wrapper;
public class BoxFactory {
    
    static int count;
    
    // 파라미터로 Z를 넣으면 Z박스를 만들어주는 메소드
    public static <Z extends Number> Box<Z> makeBox(Z obj) { // <Z extends Number> = 박스 내용물에 대한 제한
        Box<Z> box = new Box<>();
        box.set(obj);
        BoxFactory.count++;
        return box;
    }

    public int getCount() { return BoxFactory.count; }
}
