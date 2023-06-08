package W01_basic;
public class App {
    public static void main(String[] args) throws Exception {
        
        Box<Toy> tBox = new Box<>();
        BoxHandler.pushBox(tBox, new Toy());
        BoxHandler.popBox(tBox); // well-printed
        BoxHandler.popBox(tBox); // null
        BoxHandler.pushBox(tBox, new Toy());
        
        Box<RobotToy> rBox = new Box<>();
        // BoxHandler.pushBox(rBox, new RobotToy());



    }
}
