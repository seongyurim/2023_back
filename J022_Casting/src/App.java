public class App {
    public static void main(String[] args) throws Exception {
        
        Vehicle vehicle = new Bus();
        vehicle.run();
        // vehicle.checkFare(); // 호출 불가능

        Bus bus = null;
        bus = (Bus) vehicle; // 강제 타입변환
        bus.checkFare();
    }
}
