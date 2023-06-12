package C01_TreeSetReview;

public class Person implements Comparable<Person> {
    
    private int age;
    private String name; // 유니크한 값으로 간주

    public Person() {
        this.age = 0;
        this.name = "";
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge()     {return this.age;}
    public String getName() {return this.name;}
    public void setAge(int age)      {this.age = age;}
    public void setName(String name) {this.name = name;}

    // 정렬기준: 오름차순
    @Override
    public int compareTo(Person obj) {
        return this.age - obj.age;
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}