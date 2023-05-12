public class Member {
    
    // Book301013

    // 싱글톤 객체 생성
    private static Member MemberData = new Member();



    // 필드 생성
    private String name;
    private String id;
    private String password;
    private int age;



    // Q14-1. 기본생성자
    private Member(){
        name = "";
        id = "";
        password = "";
        age = 0;
    }

    // Q14-2. 이름, ID를 받는 오버로딩 생성자
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        password = ""; // 안해도 되지만
        age = 0; // 명시적으로 넣어주자
    }



    // Getter
    public String getName()                  { return this.name; };
    public String getId()                    { return this.id; };
    public String getPassword()              { return this.password; };
    public int getAge()                      { return this.age; };

    // Setter
    public void setName(String name)         { this.name = name; };
    public void setId(String id)             { this.id = id; };
    public void setPassword(String password) { this.password = password; };
    public void setAge(int age)              { this.age = age; };



    // 외부에서 불러오게 하는 메소드
    public static Member getInstance() {
        return MemberData;
    }

}
