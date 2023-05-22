public class App {    
    public static void main(String[] args) {
        
        // 탱크3, 전투기2를 만들어서 공격
        Unit[] units = new Unit[] {
            new Tank(), new Tank(), new Tank(),
            new Fighter(), new Fighter(),
        };
    
        for (int i = 0; i < units.length; i++) {
            units[i].attack();
            units[i].move(1, i);
        }
    }
}
