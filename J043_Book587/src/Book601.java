public class Book601 {

    public static class Person {}
    public static class Worker extends Person {}
    public static class Student extends Person {}
    public static class HighStudent extends Student {}
    public static class MiddleStudent extends Student {}

    public static class Applicant<T> {
        public T kind;
        public Applicant() {}
        public Applicant(T kind) {this.kind = kind;}
    }

    public static class Course {

        // 모든 사람이 등록 가능
        public static void registerCourse1(Applicant<?> applicant) {
            System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
        }

        // 학생만 등록 가능
        public static void registerCourse2(Applicant<? extends Student> applicant) {
            System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
        }

        // 직장인 및 일반인만 등록 가능
        public static void registerCourse3(Applicant<? super Worker> applicant) {
            System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
        }
    }

    public static void main(String[] args) throws Exception {

        // 모든 사람이 등록 가능: ?
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println("---------------------------------------");

        // 학생만 등록 가능: ? extends Student
        // Course.registerCourse2(new Applicant<Person>(new Person())); // error
        // Course.registerCourse2(new Applicant<Worker>(new Worker())); // error
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println("---------------------------------------");
        
        // 직장인 및 일반인만 등록 가능: ? super Worker
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        // Course.registerCourse3(new Applicant<Student>(new Student())); // error
        // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); // error
        // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); // error
    }
}