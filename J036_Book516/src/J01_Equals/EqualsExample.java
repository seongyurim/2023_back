package J01_Equals;

public class EqualsExample {
    public static void main(String[] args) {
        
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("obj1, obj2는 동등합니다."); // printed
        } else {
            System.out.println("obj1, obj2는 동등하지 않습니다.");
        }
        // 매개값이 Member 타입이고 id도 동일하므로 true

        if (obj1.equals(obj3)) {
            System.out.println("obj1, obj3은 동등합니다.");
        } else {
            System.out.println("obj1, obj3은 동등하지 않습니다."); // printed
        }
        // 매개값이 Member 타입이지만 id가 다르므로 false
    }
}
