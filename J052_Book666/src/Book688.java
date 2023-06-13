import java.util.TreeSet;

public class Book688 {
    
    public static class Person implements Comparable<Person> {

        public String name;
        public int age;

        public Person() {
            name = "";
            age = 0;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person obj) {
            if (this.age < obj.age) {
                return -1;
            }
            else if (this.age > obj.age) {
                return 1;
            }
            else { // this.age = obj.age
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        
        TreeSet<Person> set = new TreeSet<>();

        set.add(new Person("홍길동", 45));
        set.add(new Person("김자바", 25));
        set.add(new Person("박지원", 31));

        for (Person person : set) {
            System.out.println(person.name + ":" + person.age);
        }
    }
}
