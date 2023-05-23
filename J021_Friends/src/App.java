public class App {
    public static void main(String[] args) throws Exception {
        
        // <1> 인터페이스 사용 전 ------------------------------------------------
        Univ[] univFriends = new Univ[5];
        univFriends[0] = new Univ("홍길동", "010-1222-2222", "컴퓨터공학");
        univFriends[1] = new Univ("김철수", "010-1222-2222", "사회학");
        univFriends[2] = new Univ("김영희", "010-1222-2222", "경영학");
        univFriends[3] = new Univ("박수지", "010-1222-2222", "역사학");
        univFriends[4] = new Univ("이지영", "010-1222-2222", "천문학");

        Com[] comFriends = new Com[5];
        comFriends[0] = new Com("홍길동", "010-1222-2222", "총무부");
        comFriends[1] = new Com("김철수", "010-1222-2222", "회계부");
        comFriends[2] = new Com("김영희", "010-1222-2222", "법무부");
        comFriends[3] = new Com("박수지", "010-1222-2222", "경영지원부");
        comFriends[4] = new Com("이지영", "010-1222-2222", "영업부");

        // 출력
        for (int i = 0; i < univFriends.length; i++) {
            univFriends[i].show();
        }

        for (int i = 0; i < comFriends.length; i++) {
            comFriends[i].show();
        }


        // <2> 인터페이스 사용 후 ------------------------------------------------
        Friends[] friends = new Friends[Friends.MAX];
        friends[0] = new Univ("홍길동", "010-1222-2222", "컴퓨터공학");
        friends[1] = new Univ("김철수", "010-2222-2222", "사회학");
        friends[2] = new Univ("김영희", "010-3222-2222", "경영학");
        friends[3] = new Univ("박수지", "010-4222-2222", "역사학");
        friends[4] = new Univ("이지영", "010-5222-2222", "천문학");
        friends[5] = new Com("홍길동", "010-6222-2222", "총무부");
        friends[6] = new Com("김철수", "010-7222-2222", "회계부");
        friends[7] = new Com("김영희", "010-8222-2222", "법무부");
        friends[8] = new Com("박수지", "010-9222-2222", "경영지원부");
        friends[9] = new Com("이지영", "010-0222-2222", "영업부");

        // 출력
        for (int i = 0; i < friends.length; i++) {
            friends[i].show();
            System.out.println("----------------------------");
        }


    }
}
