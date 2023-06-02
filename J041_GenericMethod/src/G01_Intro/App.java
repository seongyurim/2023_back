package G01_Intro;
public class App {

    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) throws Exception {

        Box<String> box1 = BoxFactory.makeBox(new String("abc"));
        System.out.println(box1);
        // 우항에는 데이터타입 정의가 없다.
        // 그래서 좌항을 보고 판단한다. (주변 정황을 보고 판단한다 = 타겟타입(<String>) 추론)

        int a = add(4, 5);
        add(4, 5); // 이렇게 리턴값을 안받아도 된다. 임시변수에 저장되므로

        BoxFactory.makeBox(new String("abc"));
        // 이것도 마찬가지로 변수에 넣어주지 않아도 돌아간다.
        // 근데 데이터타입이 정해지지 않았는데 컴파일에 문제가 없다. 뭐지..?!
        // 꺾쇠가 없으므로 이 코드가 정상적이지 않다고는 생각해야 한다. (슈가코드)
        // 타겟타입이 없다!

        BoxFactory.<String>makeBox(new String("abc"));
        // 그래서 이렇게 호출해야 한다.
        // 클래스는 데이터타입을 뒤에 선언했었지만, 메소드는 앞에 선언한다.

        Box<String> box2 = BoxFactory.<String>makeBox(new String("abc"));
        System.out.println(box2);
        // 맨위의 코드를 이렇게 수정해야 알맞다. (제네릭 메소드)


    }
}
