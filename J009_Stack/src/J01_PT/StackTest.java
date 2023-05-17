package J01_PT;
public class StackTest {
    public static void main(String[] args) {
        
        Stack stack = new Stack(3);

        boolean result;
        result = stack.push(11); // true
        result = stack.push(22); // true
        result = stack.push(33); // true

        // void로 함수를 완성시킬 것이 아니라
        // 외부에서 메세지를 정할 수 있도록
        // if (false == stack.push(44)) {
        //     System.out.println("더이상 PUSH가 불가능합니다.");
        // }

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop(); // 오류가 발생되어야 함

        stack.printAll();

    }
}
