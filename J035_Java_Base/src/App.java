public class App {
    public static void main(String[] args) throws Exception {
        
        // Student st1 = new Student("홍길동", 1);
        // Student st2 = new Student("홍길동", 1);
        // Student st3 = new Student("이순신", 3);

        // if (st1.equals(st2)) {
        //     System.out.println("두 학생은 같습니다."); // printed
        // } else {
        //     System.out.println("두 학생은 다릅니다.");
        // }

        // if (st2.equals(st3)) {
        //     System.out.println("두 학생은 같습니다.");
        // } else {
        //     System.out.println("두 학생은 다릅니다."); // printed
        // }


        Student st1 = new Student("홍길동", 1);
        Student st2 = new Student("홍길동", 1);
        Animal ani1 = new Animal();

        if (st1.equals(ani1)) {
            System.out.println("같다.");
        } else {
            System.out.println("다르다."); // printed
        }

        // hashCode
        System.out.println(st1.hashCode());  // 798154997
        System.out.println(st2.hashCode());  // 681842941
        System.out.println(ani1.hashCode()); // 1392838282


        // toString
        // System.out.println(st1);

    }
}
