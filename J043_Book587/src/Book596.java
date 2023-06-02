public class Book596 {

    public static class Box<T> {
        private T t;
        public T get() {return t;}
        public void set(T t) {this.t = t;}
    }

    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) throws Exception {

        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue); // 100

        Box<String> box2 = boxing("hello");
        String strValue = box2.get();
        System.out.println(strValue); // Hello

    }
}