public class Zerg extends Unit {
    
    @Override
    public void attack() {
        System.out.println("[몬스터][공격] 침뱉기 공격!");
    }

    public void move(int speed) {
        System.out.printf("[몬스터][이동] %d의 속도로 뛰는 중!\n", (speed * 2));
    }
}
