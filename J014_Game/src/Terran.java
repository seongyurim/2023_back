public class Terran extends Unit {

    @Override
    public void attack() {
        System.out.println("[인  간][공격] 단거리 공격!");
    }

    public void move(int speed) {
        System.out.printf("[인  간][이동] %d의 속도로 걷는 중!\n", speed);
    }
}