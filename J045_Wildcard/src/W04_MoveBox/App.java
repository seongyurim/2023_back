package W04_MoveBox;

public class App {
    public static void main(String[] args) throws Exception {

        Box<Integer> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.set(30);
        box2.set(20);

        BoxHandler.moveBox(box1, box2);

        System.out.println("box1의 값: " + box1.get()); // 20
        System.out.println("box2의 값: " + box2.get()); // 20

    }
}
