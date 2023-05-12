public class App {
    public static void main(String[] args) {
        
        System.out.println(" ---- 14. 오버로딩 메소드 -----------------------------------------------------------");
        Member user1 = new Member("홍길동", "hong");
        System.out.println(user1.getName());



        System.out.println(" ---- 15. 로그인, 로그아웃 메소드 ---------------------------------------------------");
        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }



        System.out.println(" ---- 16. println 메소드 오버로딩 ---------------------------------------------------");
        Printer16 printer16 = new Printer16();
        printer16.println(10);
        printer16.println(true);
        printer16.println(5.7);
        printer16.println("홍길동");

        float k = 3.4f;
        printer16.println((k));
        


        System.out.println(" ---- 17. Printer 객체 생성 없이 바로 호출할 수 있도록 ------------------------------");
        Printer17.println(10);
        Printer17.println(true);
        Printer17.println(5.7);
        Printer17.println("홍길동");



        System.out.println(" ---- 18. ShopService 클래스로 싱글톤 객체 생성 -------------------------------------");
        // Q18.  //////////////////////////////////////////
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다."); // printed
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }



        System.out.println(" ---- 19. Account 클래스로 잔고 관리 ------------------------------------------------");
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance()); // 300000



    }
}
