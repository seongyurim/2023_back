public class Protoss extends Unit {
    
    @Override
    public void attack() {
        System.out.println("[외계인][공격] 원거리 공격!");
    }

    public void move(int speed) {
        System.out.printf("[외계인][이동] %d의 속도로 뛰는 중!\n", (speed * 4));
    }
}
