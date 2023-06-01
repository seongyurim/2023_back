package CloneStudent;

public class Student implements Cloneable {

    private String name;
    private int num;
    private int[] score;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }
    
    public static void cloneTest() {
        Student st1 = new Student("kcs", 1);
    }

    // 클론의 단점(얕은 복사)으로 인해 깊은 복사를 구현한 오버라이딩 메소드
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student newObject = (Student)super.clone();
        newObject.score = new int[3];
        newObject.score[0] = this.score[0];
        newObject.score[1] = this.score[1];
        newObject.score[2] = this.score[2];
        return newObject;
    }
    
    public String getName() { return this.name; }
    public int getNum()     { return this.num; }
    public int[] getScore() { return this.score; }
    
    public void setName(String name)  { this.name = name; }
    public void setNum(int num)       { this.num = num; }
    public void setScore(int[] score) { this.score = score; }
    public void setScore(int s0, int s1, int s2) {
        this.score[0] = s0;
        this.score[1] = s1;
        this.score[2] = s2;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", num='" + getNum() + "'" +
            " " + score[0] + " " + score[1] + " " + score[2] +
            "}";
    }
}
