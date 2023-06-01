package CloneStudent;

public class App {
    public static void main(String[] args) {
        
        Student st1 = new Student("kcs", 1);
        st1.setScore(new int[]{80, 90, 100});
        Student st2 = null; 

        try {
            st2 = (Student)st1.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("st1: " + st1); // 80 90 100
        System.out.println("st2: " + st2); // 80 90 100 클론 성공!

        st1.setScore(20, 20, 20);
        System.out.println("st1: " + st1); // 20 20 20
        System.out.println("st2: " + st2); // 80 90 100 깊은 복사 성공!
    }
}
