public class typeCasting {
    public static void main(String[] args) {

        // int v_int = 10;
        // short v_sho = v_int;
        // 이것은 터질 수도 있는 위험성이 내포되어 있는 캐스팅이다.
        
        // 명시적 캐스팅(explicit type casting)
        int v_int2 = 10;
        short v_sho2 = (short)v_int2;
        System.out.println(v_sho2);

        // 묵시적 캐스팅(inplicit type casting)
        // 작은 것을 큰 것에 넣었으므로 문제가 없다.
        short s1 = 1200;
        int i1 = s1;
        System.out.println(i1);

        // float f1 = 3.14f;
        // int ii = f1;
        // 사이즈'만' 맞을 뿐, 비트스트림이 서로 완전히 다르다. 비상식적인 변환이다.
        // int ii = (int)f1;로 억지로 끼워넣을 수야 있겠지만 소수점을 제거하고 3만 반환한다.

        int fff = 4;
        float ef = fff;
        System.out.println(ef);
        // 묵시적 형변환이 가능한 경우
        
    }
}
