package G05_InterfaceAndInheritance_Fruit;
public class Apple implements Eatable {

    @Override
    public void eat() {
        System.out.println("Eating an Apple");
    }

    @Override
    public String toString() {
        return "I am an Apple.";
    }
}
