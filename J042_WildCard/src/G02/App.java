package G02;
public class App {
    public static void main(String[] args) throws Exception {
        
        // <? extends Number>
        // BoxManager.printBox(new Box<Integer>(11)); // well-printed
        // BoxManager.printBox(new Box<Double>(22.2)); // well-printed
        // // BoxManager.printBox(new Box<String>("abc")); // error
        // Box<Integer> iBox = new Box<>(33);        
        // BoxManager.printBox(iBox); // well-printed
    }
}
