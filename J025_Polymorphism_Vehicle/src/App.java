public class App {
    public static void main(String[] args) throws Exception {
        
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 매개값으로 구현 객체 대입(다형성으로 인해 다른 결과가 출력됨)
        driver.drive(bus); // (bus) == ((Vehicle)bus)
        driver.drive(taxi); // (taxi) == ((Vehicle)taxi)
    }
}
