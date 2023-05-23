public class App {
    public static void main(String[] args) throws Exception {
        
        Vehicle vehicle = new Bus();
        vehicle.run(); // 호출 가능. Vehicle 인터페이스가 가지고 있는 메소드이므로
        // vehicle.checkFare(); // 호출 불가능. Bus 구현객체에만 있는 메소드이므로

        Bus bus = null;
        bus = (Bus) vehicle; // 강제타입변환
        bus.checkFare(); // 강제타입변환으로 호출이 가능하게 되었음
    }
}
