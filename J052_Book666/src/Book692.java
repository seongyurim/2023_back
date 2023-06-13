import java.util.Stack;

public class Book692 {
    
    public static class Coin {

        private int value;

        public Coin() {
            value = 0;
        }

        public Coin(int value) {
            this.value = value;
        }

        public int getValue() {return value;}
    }

    public static void main(String[] args) {
        
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(10));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));

        while (false == coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }
    }
}
