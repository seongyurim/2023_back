public class Circle_guide {
    public static void main(String[] args) {
        
        // 원의 넓이와 둘레를 구하고 싶습니다.
        // 반지름을 입력하면 원의 넓이, 둘레를 구하는 프로그램을 구현해주세요.


        Circle c1 = new Circle(10);
        System.out.println(c1.getCircum());
        System.out.println(c1.getArea());

        Circle c2 = new Circle();
        c2.setRadius(5);
        System.out.println(c2.getCircum());
        System.out.println(c2.getArea());

        
    }
}
