public class App {
    public static void main(String[] args) throws Exception {
        
        Terran h1 = new Terran();
        Zerg z1 = new Zerg();
        Protoss p1 = new Protoss();

        // h1.attack();
        // h1.move(1);

        // z1.attack();
        // z1.move(2);

        // p1.attack();
        // p1.move(2);


        System.out.println("--------------------- 단/체/공/격 ------------------------");

        // 인간 5명 만들기
        Terran[] tArray = new Terran[] {
            new Terran(), new Terran(), new Terran(), new Terran(), new Terran() };

        // 몬스터 3마리 만들기
        Zerg[] zArray = new Zerg[] {
            new Zerg(), new Zerg(), new Zerg() };

        // 외계인 2마리 만들기
        Protoss[] pArray = new Protoss[] {
            new Protoss(), new Protoss() };



        // for (int i = 0; i < 5; i++) {
        //     tArray[i].attack();
        // }

        // for (int i = 0; i < 3; i++) {
        //     zArray[i].attack();
        // }

    }
}
