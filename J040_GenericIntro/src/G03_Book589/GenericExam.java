package G03_Book589;

public class GenericExam {
    public static void main(String[] args) {
        
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);

        Box<Double> box3 = new Box<>();
        box3.content = 3.14;
        double db = box3.content;
        System.out.println(db);

        Box<Boolean> box4 = new Box<>();
        box4.content = true;
        boolean bl = box4.content;
        System.out.println(bl);
    }
}
