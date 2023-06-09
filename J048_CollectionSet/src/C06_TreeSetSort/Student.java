package C06_TreeSetSort;

public class Student implements Comparable<Student> {
    
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

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
        this.address = "";
        this.staff = "";
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
            if (number == target.getNumber() &&
                name.equals(target.getName())) {
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

    @Override
    public int compareTo(Student stu) {
        
        // 1. this, stu 둘다 일반학생
        // this와 파라미터(stu)가 같아서 스왑이 필요 없는 경우 ==> 0 리턴
        if ((this.staff.length() == 0) && (stu.staff.length() == 0)) {
            return this.number - stu.number;
        }
        
        // 2. this = 임원 / stu = 일반학생
        // this가 앞으로 가는 경우이므로 ==> 음수 리턴
        else if ((this.staff.length() > 0) && (stu.staff.length() == 0)) {
            return -1;
        }
        
        // 3. this = 일반학생 / stu = 임원
        // stu가 앞으로 가는 경우이므로 ==> 양수 리턴
        else if ((this.staff.length() == 0) && (stu.staff.length() > 0)) {
            return 1;
        }
        
        // 4. this, stu 둘다 임원
        else {            
            // 1) this = staff / stu = leader
            // 파라미터(stu)가 앞으로 가는 경우이므로 ==> 양수 리턴
            if ((this.staff.equals("staff")) && (stu.staff.equals("leader"))) {
                return 1;
            }
            
            // 2) this = leader / stu = staff
            // this가 앞으로 가는 경우이므로 ==> 음수 리턴
            else if ((this.staff.equals("leader")) && (stu.staff.equals("staff"))) {
                return -1;
            }

            else { // (this.staff.equals("staff")) && (stu.staff.equals("staff"))
                return this.number - stu.number;
            }
        }

        ////////// 답안 //////////////////////////////////////////////////////////////////////

        // if ((false == staff.isEmpty()) && (true == stu.getStaff().isEmpty())) {
        //     return -1; // 내가 앞으로 온다.
        // }

        // else if ((true == staff.isEmpty()) && (false == stu.getStaff().isEmpty())) {
        //     return 1; // 파라미터가 앞으로 온다.
        // }

        // else if ((false == staff.isEmpty()) && (false == stu.getStaff().isEmpty())) {
        //     return 0;
        // }

        // else {
        //     return this.number - stu.getNumber();
        // }
    }
}
