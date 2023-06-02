package G06_InterfacePlusInheritance_Plant;

public class App {
    public static void main(String[] args) {
        
        System.out.println("*** APPLE ***");
        Box<Apple> aBox = new Box<>(new Apple());
        aBox.eatPlants();
        aBox.makeEnergy();

        System.out.println("*** ORANGE ***");
        Box<Orange> oBox = new Box<>(new Orange());
        oBox.eatPlants();
        oBox.makeEnergy();

        // Box<Mushroom> mBox = new Box<>(); // error
        // Plants에는 속하지만, Eatable에는 속하지 않으므로
    }
}
