import transport.Car;

public class App {
    public static void main(String[] args) throws Exception {
        
        Car car1 = new Car();
        car1.setCompany("Hyundai");
        car1.setModel("Sonata");
        car1.setColor("Yellow");
        car1.setMaxSpeed(200);

        System.out.printf("car1의 제조사: %s\n", car1.company);
        System.out.printf("car1의 모델: %s\n", car1.model);
        System.out.printf("car1의 색상: %s\n", car1.color);
        System.out.printf("car1의 최대속도: %s\n", car1.maxSpeed);

        /////////////////////////////////////////////////////////////////////////

        Car car2 = new Car("KIA", "Carnival", "Black", 250);

        System.out.printf("car2의 제조사: %s\n", car2.getCompany());
        System.out.printf("car2의 모델: %s\n", car2.getModel());
        System.out.printf("car2의 색상: %s\n", car2.getColor());
        System.out.printf("car2의 최대속도: %s\n", car2.getMaxSpeed());

    }
}
