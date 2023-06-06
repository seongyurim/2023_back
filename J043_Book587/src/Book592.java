public class Book592 {

    // 인터페이스
    public interface Rentable<P> {
        public P rent();
    }

    public static class Home {
        public void turnOnLight() {
            System.out.println("전등을 켭니다.");
        }
    }

    public static class Car {
        public void run() {
            System.out.println("자동차가 달립니다.");
        }
    }

    // 집을 렌트해주는 대리점 클래스(Rentable의 타입 파라미터를 Home으로 구현)
    public static class HomeAgency implements Rentable<Home> {
        @Override
        public Home rent() {
            return new Home(); // 리턴타입이 반드시 Home이어야 함
        }
    }

    // 자동차를 렌트해주는 대리점 클래스(Rentable의 타입 파라미터를 Car로 구현)
    public static class CarAgency implements Rentable<Car> {
        @Override
        public Car rent() {
            return new Car(); // 리턴타입이 반드시 Car여야 함
        }
    }

    public static void main(String[] args) throws Exception {

        // 각 에이전시에서 대여한 Home과 Car를 이용하는 방법

        HomeAgency hAgency = new HomeAgency();
        Home home = hAgency.rent();
        home.turnOnLight(); // 전등을 켭니다.

        CarAgency cAgency = new CarAgency();
        Car car = cAgency.rent();
        car.run(); // 자동차가 달립니다.
    }
}