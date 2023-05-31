package Q05;

public class Student {
    
    private String studentNum;

    public Student() { }

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String sn) {
        this.studentNum = sn;
    }

    @Override
    public boolean equals(Object obj) {
        Student target;
        if (obj instanceof Student) {
            target = (Student)obj;
            if (studentNum.equals(target.getStudentNum())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Integer.parseInt(studentNum);
        // return studentNum.hashCode(); // 교재 정답
    }
}
