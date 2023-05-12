public class MemberService {

    // Q15. 로그인과 로그아웃 메소드

    public boolean login(String id, String password) {
        if ((id.equals("hong")) && (password.equals("12345"))) {
            return true;
        }
        return false;
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
