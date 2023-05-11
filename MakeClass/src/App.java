import academy.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        // // Student 객체를 생성
        Student stu1 = new Student(); // 기본생성자가 호출된다.
        Student stu2 = new Student("kcs", "hschool", 3); // 오버로딩 생성자가 호출된다.

        int gr = stu2.getGrade();
        System.out.println(gr);

        // // Student 객체에 값을 대입
        // stu1.name = "kcs";
        // stu1.school = "Hschool";
        // stu1.grade = 2;



    }
}
