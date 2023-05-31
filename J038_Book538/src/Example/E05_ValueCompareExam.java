package Example;
public class E05_ValueCompareExam {
    public static void main(String[] args) {
        
        // -128 ~ 127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("obj1 == obj2 : " + (obj1 == obj2));         // false
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2)); // true

        // -128 ~ 127 범위값일 경우
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("obj3 == obj4 : " + (obj3 == obj4));         // true
        System.out.println("obj3.equals(obj4) : " + obj3.equals(obj4)); // false

    }
}
