public class Printer16 {
    
    // Q16. println 메소드 오버로딩
    public void println(int value) {
        System.out.println(value);
    }

    public void println(boolean value) {
        System.out.println(value);
    }

    public void println(double value) {
        System.out.println(value);
    }

    public void println(String value) {
        System.out.println(value);
    }

    // public int println(double value) {
    //     System.out.println(value);
    //     return 0;
    // }
    // 파라미터가 다른 것이 오버로딩 생성의 기준이 되는 것이지 리턴값이 기준이 되지는 않는다.
    // 그렇기 때문에 오류가 난 것이다.
    
}
