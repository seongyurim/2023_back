package E07_CustomException;

public class App {
    public static void main(String[] args) {
        
        Student stu1 = StudentFactory.makeStudent("kcs", 20);
        System.out.println(stu1);

        Student stu2 = new Student("abc", 0);

    }    
}
