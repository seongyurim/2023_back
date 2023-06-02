public class Book595 {

    public static class Box<T> {

        public T content;

        public boolean compare(Box<T> other) {
            boolean result = content.equals(other.content);
            return result;
        }
    }

    public static void main(String[] args) throws Exception {

        Box<String> box0 = new Box<>();
        box0.content = "999";

        Box box1 = new Box();
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        boolean result1 = box1.compare(box2);
        System.out.println("result1: " + result1); // true

        boolean result2 = box1.compare(box3);
        System.out.println("result2: " + result2); // false
    }
}