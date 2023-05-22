public class SmartPhone extends Phone {

        public String model; // 중복된 필드는 잘못 설계된 코드이다.
    
    public SmartPhone() {
        System.out.println("SmartPhone - Default Constructor");
    }

    public SmartPhone(String model, String color) {
        // 상위클래스가 무엇인지 알 수 없는 경우가 있으므로 이는 적절하지 않다.
        // this.model = model;
        // this.color = color;

        // 따라서 상위클래스의 초기화 즉, 생성자를 명시적으로 호출하는 것이 알맞다.
        // 상위클래스의 생성자는 항상 가장 앞에 두어야 한다.
        super(model, color);
        System.out.println("SmartPhone - Overloaded Constructor");
    }

    public void ring2() {
        System.out.println("뉴진스 음악~");
    }
}
