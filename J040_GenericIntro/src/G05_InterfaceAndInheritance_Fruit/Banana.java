package G05_InterfaceAndInheritance_Fruit;
public class Banana implements Eatable {

    @Override
    public void eat() {
        System.out.println("Eating a Banana");
    }

    @Override
    public String toString() {
        return "I am a Banana.";
    }
}
