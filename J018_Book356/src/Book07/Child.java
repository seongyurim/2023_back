package Book07;

public class Child extends Parent {
    
    public String name;

    public Child() {
        this("홍길동"); // 자기자신의 오버로딩 생성자를 호출한 것
        System.out.println("Child() Call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) Call");
    }

}
