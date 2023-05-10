import transport.Car;

public class App {
    public static void main(String[] args) throws Exception {
        
        Car avante = new Car();
        avante.setCompany("Hyundai");
        avante.setModel("Normal");
        avante.setColor("Yellow");
        avante.setMaxSpeed(200);

        System.out.printf("car1의 제조사: %s\n", avante.getCompany());
        System.out.printf("car1의 모델: %s\n", avante.getModel());
        System.out.printf("car1의 색상: %s\n", avante.getColor());
        System.out.printf("car1의 최대속도: %s\n", avante.getMaxSpeed());

        /////////////////////////////////////////////////////////////////////////

        Car sonata = new Car("Hyundai", "N-Line", "Black", 250);

        System.out.printf("car2의 제조사: %s\n", sonata.getCompany());
        System.out.printf("car2의 모델: %s\n", sonata.getModel());
        System.out.printf("car2의 색상: %s\n", sonata.getColor());
        System.out.printf("car2의 최대속도: %s\n", sonata.getMaxSpeed());

    }
}
