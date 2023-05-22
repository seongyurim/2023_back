package Book08;

public class SnowTireExample {
    public static void main(String[] args) {
        
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run(); // 예상: 스노우 타이어가 굴러갑니다.
        tire.run(); // 예상: 스노우 타이어가 굴러갑니다.

        

    }   
}
