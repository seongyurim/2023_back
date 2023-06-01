package G02_FruitBox;

public class DBoxApp {
    public static void main(String[] args) {
        
        // left: int, right: String
        // ex. 1, "apple"

        // 객체 생성
        DBox<Integer, String> dBox = new DBox<>();

        // set 호출
        dBox.set(1, "apple");
        // 1은 오토박싱이 되어 래퍼클래스로 들어가고, apple은 new String으로 할당됨

        // println
        System.out.println(dBox);

    }
}
