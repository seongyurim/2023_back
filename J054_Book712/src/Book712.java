public class Book712 {

    //// 람다식 만들어보기

    @FunctionalInterface
    public static interface Calculable {
        void calculate(int x, int y);
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }

    public static void main(String[] args) {
        
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result); // 14
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result); // 6
        });
    }
}