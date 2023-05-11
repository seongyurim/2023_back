public class App {
    public static void main(String[] args) {
        
        Member user1 = new Member("홍길동", "hong");
        System.out.println(user1.getName());



        // Q15. 로그인과 로그아웃 메소드 ////////////////////////////////////////////////////////
        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }



        // Q16. println 메소드 오버로딩 /////////////////////////////////////////////////////////
        Printer16 printer16 = new Printer16();
        printer16.println(10);
        printer16.println(true);
        printer16.println(5.7);
        printer16.println("홍길동");



        // Q17. Printer 객체 생성 없이 바로 호출할 수 있도록 ////////////////////////////////////
        Printer17.println(10);
        Printer17.println(true);
        Printer17.println(5.7);
        Printer17.println("홍길동");



        // Q18. ShopService 클래스로 싱글톤 객체 생성 //////////////////////////////////////////
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {}


    }
}
