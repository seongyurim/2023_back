package academy;
public class Student {
    
    public String name;        // 이름
    public String school;      // 학교
    public int    grade;       // 학년 // grade = 2 처럼 여기에 값을 넣는 것은 매우 좋지 않은 코드이다.
                                       // 여학교일 때 public String gender = female, pi = 3.14; 같이 불변하는 값일때만 이곳에 쓴다.
                                       // 하지만 이것마저도 static 문법과 함께 사용하는 것이므로 지금은 사용하지 말자.

    // Student 객체를 '초기화'할 수는 없나? ==> 할 수 있다 ==> 생성자를 통해서
    // 생성자
    // 1. 기본생성자는 무조건 만들어준다.
    // 2. 활용도에 따라 오버로딩된 생성자를 만들어준다.
    // 3. 아무런 생성자가 없는 경우, 자바는 기본생성자를 자동으로 만들어 넣어준다.
    // 3-1. 기본생성자 없이 오버로딩 생성자만 있는 경우 에러가 뜬다.
    // 3-2. 3 규칙에 의해서 기본생성자가 자동으로 만들어지지 않으므로


    // 기본생성자(Default Constructor)
    // Student stu1 = new Student(); 일 때 호출된다.
    public Student()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
        name = "";
        school = "";
        grade = 0;
    };


    // 오버로딩 생성자(Overloading Constructor)
    // 오버로딩: 함수 호출 시 함수의 이름과 파라미터 정보를 복합적으로 해석해서 호출하는 기법
    // Student stu2 = new Student("kcs", "hschool", 2); 일 때 호출된다.
    public Student(String name, String school, int grade)
    {
        System.out.println("OVERLOADED CONSTRUCTOR");
        this.name = name;
        this.school = school;
        this.grade = grade;
    };

    public void setGrade(int Grade)
    {
        this.grade = grade;
    }

    public int getGrade()
    {
        return grade;
    }
    
}
