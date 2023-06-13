package Book10;

import java.util.Objects;

public class Student implements Comparable<Student> {
    
    public String id;
    public int score;

    public Student() {
        id = "";
        score = 0;
    }

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        Student target;
        if (obj instanceof Student) {
            target = (Student)obj;
            if (id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
              " id='" + this.id + "'" +
              ", score='" + this.score + "'" +
              "}";
    }

    @Override
    public int compareTo(Student stu) {
        return this.score - stu.score;
    }
}
