package Book08;

import java.util.Objects;

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
        return studentNum % 5; // 데이터의 수량을 대충 짐작할 수 있는 경우
        // return Objects.hash(studentNum); // 짐작이 어려운 경우
    }
}
