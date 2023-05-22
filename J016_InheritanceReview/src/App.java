public class App {
    public static void main(String[] args) throws Exception {
        
        SmartPhone smartPhone = new SmartPhone("iPhone", "silver");
        smartPhone.model = "mmm";
        System.out.println(smartPhone.model);
        System.out.println(smartPhone.vendor); // 삼성전자
        System.out.println(Phone.vendor); // 삼성전자



        // 상위 객체의 참조값으로 하위 객체를 참조할 수 있다.
        Phone phone = new SmartPhone();
        phone.ring1(); // 가능
        // phone.ring2(); // 불가능
        // phone은 SmartPhone만 참조할 수 있으므로

        // ring이 SmartPhone에서 오버라이딩되어 있다면 오버라이딩된 메소드로 호출 가능(뉴진스 음악)
        // 이것이 메소드 오버라이딩의 진정한 의미
        // phone.ring();
    }
}
