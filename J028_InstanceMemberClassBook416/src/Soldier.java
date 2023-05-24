public class Soldier {

    private class MachineGun {

        public int bullet; // 총알
        public int damage; // 총알 당 공격력

        public MachineGun() {
            bullet = 10;
            damage = 1;
        }
    }

    public MachineGun mGun;

    public Soldier() {
        mGun = new MachineGun();
    }

    int bullet = mGun.bullet;
    public void shotAll() {
        for (int i = 0; i < bullet; i++) {
            System.out.println("데미지 : " + mGun.damage);
            mGun.bullet--;
        }
        System.out.println("총알수 : " + mGun.bullet);
    }
}