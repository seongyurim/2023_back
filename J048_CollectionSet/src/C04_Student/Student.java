package C04_Student;

public class Student {
    
    private String name;    // 이름
    private String address; // 주소
    private int    number;  // 학번(Key 성격이 있으므로 생성자 생성 시 맨 앞에 두기를 권장)
    private String staff;   // 반장("leader"), staff("staff"), 일반학생("")


    // 1. Constructor
    public Student() {
        this.number = 0;
        this.name = "";
        this.address = "";
        this.staff = "";
    }

    public Student(int number, String name, String address, String staff) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.staff = staff;
    }

    // 2. Getter & Setter
    public int getNumber()     {return this.number;}
    public String getName()    {return this.name;}
    public String getAddress() {return this.address;}
    public String getStaff()   {return this.staff;}

    public void setNumber(int number)      {this.number = number;}
    public void setName(String name)       {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setStaff(String staff)     {this.staff = staff;}


    // 3. equals()
    @Override
    public boolean equals(Object obj) {
        Student target;
        if (obj instanceof Student) {
            target = (Student)obj;
            if (name.equals(target.getName()) &&
                number == target.getNumber()) {
                    return true;
            }
        }
        return false;
    }


    // 4. hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() +
               address.hashCode() +
               staff.hashCode()
               % 5;
    }

    // 5. toString()
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", number='" + getNumber() + "'" +
            ", staff='" + getStaff() + "'" +
            "}";
    }

    // 6. clone()
    // 필요 없을 듯..

}
