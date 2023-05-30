// 클래스 생성 방법
// 1. 기본생성자, 오버로딩 생성자
// 2. Getter, Setter
// 3. @Override equals()
// 4. @Override toString() - JSON 형식 -> Code Generator 추천(단, 무지성 생성은 금물)
// 위 규칙은 모든 객체지향 언어에 해당된다.

public class Student {

    private String name; // 이름
    private int num;

    // 1. 기본생성자
    public Student() {}

    // 2. 오버로딩 생성자
    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    // 3. equals 재정의
    @Override
    public boolean equals(Object obj) {

        Student target;
        if (obj instanceof Student) {
            target = (Student)obj;
        } else {
            return false;
        }
        
        if (false == this.name.equals(target.name)) {
            return false;
        }
        if (this.num != target.num) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() + num);
    }

    // JSON 형태(Key - Value 형태)
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", num='" + getNum() + "'" +
            "}";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }



}