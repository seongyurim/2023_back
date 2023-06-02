package G03_SwapNumber;

public class App {

    public static <T extends Number> void swapBox(Box<T> aBox, Box<T> bBox) {
        // temp = a;
        // a = b;
        // b = temp;

        Box<T> temp = BoxFactory.makeBox(null);
        temp.set(aBox.get());
        aBox.set(bBox.get());
        bBox.set(temp.get());        
    }
    public static void main(String[] args) throws Exception {

        Box<Integer> box1 = BoxFactory.makeBox(10);
        Box<Integer> box2 = BoxFactory.makeBox(20);

        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

        swapBox(box1, box2);
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

    }
}
