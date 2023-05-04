public class Circle {
    // 1. 클래스명


    // 2. Attribute 도출
    private double radius;
    private double pi;
    private int circle = 0;


    // 4. Constructor
    public Circle()
    {
        this.pi = 3.14;
        radius = 0;
        System.out.println("Default Constructor 도출");
    }

    public Circle(double radius)
    {
        this.pi = 3.14;
        this.radius = radius;
        System.out.println("Overloaded Constructor 도출");
    }


    // 3-1. Setter
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    // 3-2. Getter
    public double getRadius()
    {
        return radius;
    }

    
    // 5. 메소드 추가
    // 원의 넓이 구하기
    public double getArea()
    {
        // 반지름 * 반지름 * 3.14
        return radius * radius * pi;
    }

    // 원의 둘레 구하기
    public double getCircum()
    {
        // 반지름 * 2 * 3.14
        return radius * 2 * pi;
    }
}
