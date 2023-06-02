package G01_Intro;
public class App {
    public static void main(String[] args) throws Exception {
        
        Box<Integer> iBox = new Box<>(10);
        Box<String> sBox = new Box<>("abc");
        
        BoxManager.printBox(iBox); // error
        BoxManager.printBox(sBox); // error
    }
}
