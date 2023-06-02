package Book604.Q03;

public class ContainerExam {
    public static void main(String[] args) {
        
        Container<Integer, String> container1 = new Container<>();
        container1.set(11, "도적");
        int num = container1.getKey();
        String job = container1.getValue();
        System.out.println(num);
        System.out.println(job);

        // Container<String, Integer> container2 = new Container<>(); // Number 제한으로 인해 에러
        // container2.set("홍길동", 35);
        // String name2 = container2.getKey();
        // int age = container2.getValue();
        // System.out.println(name2);
        // System.out.println(age);


    }
}
