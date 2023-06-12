package Book703.Book08;

public class Student {
    
    public int studentNum;
    public String name;

    public Student() {
        studentNum = 0;
        name = "";
    }

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student target;
        if (obj instanceof Student) {
            target = (Student)obj;
            if (this.studentNum == target.studentNum) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
