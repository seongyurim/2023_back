public class MemberApp {
    public static void main(String[] args) {
        
        Member m1 = new Member("kcs", "김철수", 30);
        Member m2 = new Member("kcs", "김철수", 30);

        System.out.println(m1);
        System.out.println(m1.name());

        if (m1.equals(m2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다.");
        }

        // 안쓰는 기능
        
    }
}
