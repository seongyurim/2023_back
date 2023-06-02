package G02_Wrapper;
public class App {

    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) throws Exception {

        // 컴파일 에러
        // Box<String> box1 = BoxFactory.makeBox(new String("abc")); // error
        // System.out.println(box1);

        // BoxFactory 클래스의 makeBox에서 Z를 Number로 제한하였다.
        // 컴파일 통과
        Box<Integer> box2 = BoxFactory.makeBox(12);
        System.out.println(box2);
        Box<Double> box3 = BoxFactory.makeBox(12.25);
        System.out.println(box3);
        // 하지만 Z와 T의 frame이 다르다.
        // 좌항(Box Class)        T의 데이터타입: 아무 클래스
        // 우항(BoxFactory Class) Z의 데이터타입: Number에서 상속받은 클래스들
        // 만들어진 데이터타입은 Integer로 같으나 frame이 다른 상태이다.
        // frame이 서로 다르므로 논리적으로 알맞지 않은 상태이다.
        // 즉, 박스공장에서 만들어낸 박스와 순수한 박스 사이에 미스매치가 발생하였다.
        // 그렇다면 Box 클래스의 T에도 똑같이 제한을 두어야 할까?
        // 무엇이 정답일까?! 문법의 본질을 깊게 생각해보자.

        // 사실 정답은 없다.
        // 박스에 어떤 것을 담을지 모르는 경우에는 Box 클래스를 제한하면 안된다.
        // 하지만 커피박스만 생성하는 경우라면 Box 클래스를 제한하는 것이 알맞다.
        
        // 하지만 제네릭은 보통 제한을 둔다.
        // 그렇지 않으면 오브젝트형으로만 코드를 구현할 수 밖에 없기 때문이다.
        // 제한을 두면 그 제한자 내의 메소드를 가져와 구현할 수 있게 된다.

        // 지금같은 경우에는 박스공장과 박스에 모두 제한을 두는 것이 알맞겠다.
        // 하지만 지금 코드때문에 '항상 두곳에 다 제한해야해'라고 생각하는 것은 금물이다.
        // 상황에 따라 달라지기 때문이다.



    }
}
