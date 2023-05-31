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
        } else {
            return false;
        }

        if (false == this.studentNum.equals(target.studentNum)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Integer.parseInt(studentNum);
    }
}
