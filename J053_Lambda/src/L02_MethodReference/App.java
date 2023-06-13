package L02_MethodReference;

public class App {
    public static void main(String[] args) {
        
        // 사람이 컴퓨터를 이용하여 두 수를 더하려는 코드

        // 방법1
        // 컴파일러가 주변 정황 추론 + 람다식 사용 = 임시객체를 만들어낸다.
        Person p1 = new Person();
        Calcuable cal1 = (a, b) -> {return Computer.calcAdd(a, b);}; // "아 우항에서는 double calc 메소드를 구현하고 있구나"
        p1.action(cal1);

        // 방법2
        // Computer 클래스에 calcAdd 메소드를 네가 한번 봐봐.
        // 그러면 Calcuable 인터페이스를 구현한 임시객체를 만들어낼 수 있단다.
        // '인터페이스 메소드처럼' double형 파라미터 2개를 받아서 double형을 리턴하는 형태가 바로 거기에 있어!

        // 즉, 컴파일러에게 주변 정황을 판단하게 만드는 것이 아니라
        // 인터페이스의 메소드와 똑같은 메소드가 존재한다면 그냥 그것을 그대로 만드는 것이다.

        Calcuable cal2 = Computer :: calcAdd; // "컴파일러야, 저기로 가면 네가 원하는 정보가 다 있어"
        // Calcuable cal2 = Computer.calcAdd(); // dot(.)은 호출하라는 의미. ::는 호출하라는 의미가 아니다. "가서 봐라!"
        p1.action(cal2);

        // cal1, cal2의 우항은 완전히 같은 결과를 도출한다.

        Computer com = new Computer();
        Calcuable cal3 = com :: calcMultiple; // = "com 객체의 calcMultiple 메소드를 참고해서 임시객체를 만들 수 있단다."
        p1.action(cal3);

        // p1.action(com :: calcMultiple); // 위의 세줄을 이렇게 축약할 수 있다.
        // p1.action(new Computer() :: calcMultiple); // com = new Computer() 이므로 이렇게도 가능

        // 이 다음 파트에는 생성자 참조가 있다.
        // 하지만 생성자는 메소드처럼 베끼는 경우가 잘 없다.
    }
}