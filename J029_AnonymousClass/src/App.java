public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car();

        car.run();

        System.out.println("---- snowing ----");
        car.changeTire();
        car.run();

    }
}
