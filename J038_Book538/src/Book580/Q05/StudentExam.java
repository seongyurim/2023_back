package Q05;

public class StudentExam {
    public static void main(String[] args) {
        
        Student st1 = new Student();
        Student st2 = new Student();
        String str = new String("111");
        st1.setStudentNum(str);
        st2.setStudentNum(str);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

    }
}
