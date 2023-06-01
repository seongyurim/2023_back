package G06_InterfacePlusInheritance_Plant;

public class App {
    public static void main(String[] args) {
        
        Box<Orange> oBox = new Box<>();
        oBox.set(new Orange());
        oBox.eatPlant();

        Box<Apple> aBox = new Box<>();
        aBox.set(new Apple());
        aBox.eatPlant();

        // Box<Mushroom> mBox = new Box<>(); // error


    }
}
