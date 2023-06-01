package G05_InterfaceAndInheritance_Fruit;

public class App {
    public static void main(String[] args) {
        
        // <T extends Eatable> ///////////////////////////////////////////////////////
        Box<Apple> aBox = new Box<>();
        aBox.set(new Apple());
        aBox.eatFruit();
        // Box<PoisonousMushroom> dBox = new Box<>(); // error


        // <T extends java.lang.Number> //////////////////////////////////////////////
        // Box<Integer> iBox = new Box<>();
        // iBox.set(100);
        // System.out.println(iBox.getIntValue());

        // Box<Double> dBox = new Box<>();
        // dBox.set(40.34);
        // System.out.println(dBox.getIntValue());

        // Box<Apple> aBox = new Box<>(); // error

    }
}
