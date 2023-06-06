package G02;
public class App {
    public static void main(String[] args) throws Exception {
        
        // <? extends Number>인 경우
        BoxManager.printBox(new Box<Integer>(11)); // well-printed

        BoxManager.printBox(new Box<Double>(22.24)); // well-printed
        // 이 코드는 printBox(Box<? super Integer box)라면 error
 
        // BoxManager.printBox(new Box<String>("abc")); // error

        Box<Integer> iBox = new Box<>(33);
        BoxManager.printBox(iBox); // well-printed
    }
}
