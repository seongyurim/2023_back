import java.util.*;

public class Book667 {
    
    public static class Member {
        public String name;
        public int age;

        public Member() {
            name = "";
            age = 0;
        }

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + age;
        } // name과 age 값이 같으면 동일한 해시코드 리턴

        @Override
        public boolean equals(Object obj) {
            Member target;
            if (obj instanceof Member) {
                target = (Member)obj;
                if((target.name.equals(name) &&
                    target.age == age)) {
                    return true;                        
                }
            }
            return false;
        }

        public static void main(String[] args) {
            
            Set<Member> set = new HashSet<>();

            // 인스턴스는 다르지만 동등 객체이므로 1개만 저장될 것이다.
            set.add(new Member("김노랑", 20));
            set.add(new Member("김노랑", 20));

            System.out.println("총 객체 수: " + set.size()); // 1  
        }
    }
}
