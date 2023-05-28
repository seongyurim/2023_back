package E07_CustomException;
public class Student {
    
    public String name;
    public int age;

    public Student() {
        name = null;
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;

        try {
            this.age = age;
            if ((age <= 0) || (age < 150)) {
                throw new ReadAgeException();
            }
        } catch (ReadAgeException e) {
            e.printStackTrace();
        }
    }
}
