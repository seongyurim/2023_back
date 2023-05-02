public class App {
    public static void main(String[] args) throws Exception {

        // 미션1 : 두 수를 더하는 코드를 구현해 봅시다.

        // 4byte 정수(integer) - (-21억 ~ +21억) ////////////////////////////////////////////////////////////////////////////////////////////
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // 2byte 정수(integer) - (-32,000 ~ +32,000)
        short c = 10;
        short d = 30;
        System.out.println(c + d);

        // 1byte 정수 - (-128 ~ +127)
        byte e = 10;
        byte f = 21;
        System.out.println(e + f);

        // 8byte 정수(integer) - (-922경 ~ +922경)
        // 가장 마지막에 만들어진 데이터타입으로, 구버전에서는 적용되지 않을 수 있다.
        // 이보다 더 큰 숫자는 문자열로 취급한다. 더이상 숫자로 취급하지 않는다.
        long g = 1000000000;
        long h = 2043040;
        System.out.println(g + h);


        int val1 = 20;
        short val2 = 30;
        System.out.println(val1 + val2);
        // 비트스트림이 서로 다르므로 값이 도출될지언정 더하는 것 자체가 어색하다.
        // val1과 연산하기 위해 val2를 4byte로 바꾼다.

        int val3 = 20;
        long val4 = 30;
        System.out.println(val3 + val4);
        // val4와 연산하기 위해 val3가 8byte로 바뀐다.
        // 결론: 두 수를 더할 때 서로 데이터타입이 다른 경우, 작은 타입을 큰 타입으로 묵시적 형변환(확장)을 수행하여 계산한다.

        // 리터럴
        // 인간이 인식할 수 있도록 표현하는 것
        byte val5 = 0x10; // 16진수(16)
        byte val6 = 21;
        System.out.println(val5 + val6); // 16 + 21

        long val7 = 10000000000L;
        // 정수의 범위를 벗어난 숫자는 뒤에 L(long)을 쓰기로 정했다.





        // (배정도) 실수 - 8byte (해상도가 높다) ////////////////////////////////////////////////////////////////////////////////////////////
        double i = 10.5;
        double j = 2.3;
        System.out.println(i + j);

        // (단정도) 실수 - 4byte (해상도가 낮다) ////////////////////////////////////////////////////////////////////////////////////////////
        float r = 10.2f;
        float k = 4.0f;
        System.out.println(r + k);
    }
}
