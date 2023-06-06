package Book604.Q02;

public class ContainerExam {
    public static void main(String[] args) {
        
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.println(str); // 홍길동

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println(value); // 6
    }
}
