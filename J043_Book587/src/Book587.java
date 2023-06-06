public class Book587 {

    public static class Box<T> {
        public T content;
    }

    public static void main(String[] args) throws Exception {
        
        // Box T를 생성할 때 타입 파라미터 대신 String으로 생성
        Box<String> box1 = new Box<>();
        box1.content = "Hi World";
        String content = box1.content;
        System.out.println(content);

        // Box T를 생성할 때 타입 파라미터 대신 Integer로 생성
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}