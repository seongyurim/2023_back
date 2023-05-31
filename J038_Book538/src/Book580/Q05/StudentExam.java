package Q05;

public class StudentExam {
    public static void main(String[] args) {
        
        Student st1 = new Student();
        Student st2 = new Student();

        String str = new String("22");
        st1.setStudentNum(str);
        st2.setStudentNum(str);
        
        System.out.println(st1.hashCode()); // 1933863349
        System.out.println(st2.hashCode()); // 112810381

    }
}
