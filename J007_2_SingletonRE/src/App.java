public class App {
    public static void main(String[] args) throws Exception {
        
        // 14. 외부에서 초기화
        Member user1 = new Member("홍길동", "hong");
        System.out.printf("이름은: %s, 아이디는: %s\n", user1.getName(), user1.getId());

        // 15. 로그인, 로그아웃
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

        // 16. Printer 객체 생성 후 println 호출
        Printer16 printer16 = new Printer16();
        printer16.println(10);
        printer16.println(true);
        printer16.println(5.7);
        printer16.println("홍길동");

        // 17. 객체 생성 없이 println 호출
        Printer17.println(10);
        Printer17.println(true);
        Printer17.println(5.7);
        Printer17.println("홍길동");

        // 18. 싱글톤 객체 생성
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같습니다.");
        } else {
            System.out.println("다릅니다.");
        }


    }
}
