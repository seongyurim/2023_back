package Q12;

public class IntegerCompareExam {
    public static void main(String[] args) {
        
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        // 값만 비교했는데 3, 4는 false가 나왔다.
        System.out.println(obj1 == obj2); // true
        System.out.println(obj3 == obj4); // false

        // 아래처럼 equals를 사용하니 값만 비교할 수 있게 되었다.
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj3.equals(obj4)); // true
    }
}
