public class Member {
  
  // 13. 해당 데이터를 가지는 Member 클래스 생성
  private String name;
  private String id;
  private String password;
  private int age;

  // 기본생성자
  private Member() {
    name = "";
    id = "";
    password = "";
    age = 0;
  }

  // 14. 오버로딩 생성자
   public Member(String name, String id) {
    this.name = name;
    this.id = id;
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



}
