public class Circle {
    
    final public static double pi = 3.14; // 이 변수는 final 선언되어 앞으로 절대 변경할 수 없음
    public double radius;

    // 객체가 없으면 실행되지 않음
    public double getSize() {
        return this.radius * this.radius * Circle.pi; // Circle.pi를 pi로 해도 돈다니..?! Sugar-code!
    }

    // 함수에 static을 붙였으니 global에서 돌까? 아니다!

    public static double getCircum(double radius) {
        return 2 * radius * Circle.pi;
    }

}
