package W03_WildGenericMix;

public class App {
    public static void main(String[] args) throws Exception {
        
        Box<Toy> tBox = new Box<>();
        Box<Doll> dBox = new Box<>();

        BoxHandler.inBox(tBox, new Toy());
        BoxHandler.inBox(dBox, new Doll());

        BoxHandler.checkBox(tBox); // This is a Toy
        BoxHandler.checkBox(dBox); // This is a Doll

    }
}
