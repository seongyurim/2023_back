package G04_Inheritance;

public class App {
    public static void main(String[] args) {
        
        SteelBox<Integer> iBox = new SteelBox<Integer>(100);
        SteelBox<String> sBox = new SteelBox<String>("abc");
        System.out.println(iBox);
        System.out.println(sBox);
        // SteelBox의 타입이 결정되는 순간, Box의 타입도 결정된다.
        // SteelBox의 T가 결정되면 상위클래스, 즉 Box의 T도 동일하게 결정된다.(매 우 중 요)

    }
}
