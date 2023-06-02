public class Book587 {

    public static class Box<T> {
        public T content;
    }

    public static void main(String[] args) throws Exception {
        
        Box<String> box = new Box<>();
        box.content = "Hi World";
        String content = box.content;
        System.out.println(content);

    }
}