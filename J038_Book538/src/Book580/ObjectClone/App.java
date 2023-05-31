package ObjectClone;

public class App {
    public static void main(String[] args) {
        
        Student st1 = new Student("kcs", 1);
        Student st2 = null; 
        st1.setScore(new int[]{80, 90, 100});

        try {
            st2 = (Student)st1.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // System.out.println(st2); // 클론 성공

        System.out.println(st1);
        st1.setScore(20, 20, 20);
        System.out.println(st2);
    }
}
