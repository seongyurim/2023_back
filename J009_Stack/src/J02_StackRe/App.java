package J02_StackRe;

public class App {
    public static void main(String[] args) {
        
        Stack stack = new Stack(5);

        boolean res;
        res = stack.push(10);
        res = stack.push(20);
        res = stack.push(30);
        res = stack.push(40);
        res = stack.push(50);
        res = stack.push(60); // false

        // int data;
        // data = stack.pop(); // 30 예상
        // data = stack.pop(); // 20 예상
        // data = stack.pop(); // 10 예상
        // data = stack.pop(); // 정수의 최소값

        // if (data == Stack.ERROR_STACK) {
        //     System.out.println("스택 에러입니다.");
        // }

        stack.printAll();
    }    
}
