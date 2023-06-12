import java.util.HashMap;

public class C01_Intro {
    public static void main(String[] args) throws Exception {
        
        HashMap<Integer, String> map = new HashMap<>();

        // 추가하기
        map.put(1, "봄");
        map.put(2, "여름");
        map.put(3, "가을");
        map.put(4, "겨울");

        // 꺼내기
        System.out.println(map.get(3)); // 가을
        System.out.println(map.get(4)); // 겨울

        // 삭제하기
        map.remove(1);
        System.out.println(map.get(1)); // null

    }
}
