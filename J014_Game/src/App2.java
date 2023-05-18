public class App2 {
    public static void main(String[] args) throws Exception {
        
        // Unit u1 = new Zerg();
        // Unit u2 = new Terran();
        // Unit u3 = new Protoss();



        Unit u1 = new Zerg();
        u1.attack(); // 유닛의 어택이 아니라 저그의 어택이 출력된다.



        Unit[] units = new Unit[] {
            new Zerg(), new Zerg(), new Zerg(), new Zerg(),
            new Protoss(), new Protoss(), new Protoss(), new Protoss(), new Protoss(),
            new Terran(), new Terran(), new Terran()
        };        

        // 유닛이 어택이 아니라 각 대상의 어택이 오버라이딩되어 출력되었다.
        // 아래 코드에서 적용된 기술 2가지
        // 1) 형변환(부모의 객체로 자식의 객체를 참조) -> 다형성(339p)
        // 2) 재정의(오버라이딩 기술)
        for (int i = 0; i < units.length; i++) {
            units[i].attack();
        }

        // 객체 타입 확인(343p)
        boolean a = units[0] instanceof Zerg;
        System.out.println(a); // true
        boolean b = units[0] instanceof Terran;
        System.out.println(b); // false























        // // 몬스터 4마리
        // Zerg[] zArray = new Zerg[] {
        //     new Zerg(), new Zerg(), new Zerg(), new Zerg() };

        // // 외계인 5마리
        // Protoss[] pArray = new Protoss[] {
        //     new Protoss(), new Protoss(), new Protoss(), new Protoss(), new Protoss() };

        // // 인간 3명
        // Terran[] tArray = new Terran[] {
        //     new Terran(), new Terran(), new Terran() };

        // for (int i = 0; i < 5; i++) {
        //     tArray[i].attack();
        // }

        // for (int i = 0; i < 3; i++) {
        //     zArray[i].attack();
        // }

    }
}
