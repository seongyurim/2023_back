package Book10;

public class Computer extends Machine {
    
    public void work() {
        System.out.println("Working");
    }

    // 이 클래스에 에러가 발생한 이유
    // Computer는 추상클래스인 Machine을 상속받았다.
    // 따라서 Computer 클래스 내에는 Machine 내에 있는 추상메소드를 상속받을 메소드가 있어야 한다.
    // 그런데 없었기 때문에 오류가 난 것이다.

}
