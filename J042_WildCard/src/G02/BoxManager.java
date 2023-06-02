package G02;
public class BoxManager {

    // public static void printBox(Box<? extends Number> box) { // Number를 포함한 하위 클래스들
    //     int value = box.get().intValue();
    //     System.out.println("intValue: " + value);
    // }

    public static void printBox(Box<? super Integer> box) { // Number를 포함한 상위 클래스들
        
    }

}