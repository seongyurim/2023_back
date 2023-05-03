public class Floating {
    public static void main(String[] args) {
        
        // 실수형은 float과 double 두 종류가 있습니다.
        // float : 4byte - 해상도가 낮다.
        // double : 8byte - 해상도가 높다.

        // float인 경우 postfix f를 붙여줍니다.
        float pi = 3.14f;
        float res = pi * 0.31f;
        System.out.println(pi);
        System.out.println(res);

        // double인 경우 postfix를 생략합니다.
        double pi2 = 3.14;
        System.out.println(pi2);

        // 소수점 두자리인 두개의 수를 연산하면 결과값이 소수점 네자리가 나올 수 있다.
        // 즉 실수 연산에서 소수점 이하 자리가 증가되기 때문에 float을 사용할 경우 데이터의 유실이 발생할 수 있다.
        // 그래서 실수 연산 시에는 float이 아닌 double을 사용한다.
        
    }
}
