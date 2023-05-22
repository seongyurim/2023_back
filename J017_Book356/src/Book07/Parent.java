package Book07;

public class Parent {
    
    public String nation;

    public Parent() {
        this("대한민국"); // 자기자신의 오버로딩 생성자를 호출한 것
        System.out.println("Parent() Call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) Call");
    }

    // 기본 생성자에서 오버로딩 생성자를 호출하는 위같은 코드는 매우 안좋은 코드이다.
    // 문맥상 적절하지 않기 때문이다.
    // 이는 마치 add(x, y)라는 함수를 보면 더하기라고 생각이 드는데
    // 알고보니 그 함수가 더하기가 아닌 곱하기인 상황인 것이다.
    // 맥락에 맞지 않는 코드이므로 현업에서 이런 실수를 하면 시말서감!
    // 즉, 기본생성자에서 다른 생성자를 만드는 것은 미친 짓이다! 절대 그러지 말자.
}
