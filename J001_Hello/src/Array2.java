public class Array2 {
    public static void main(String[] args) {
        
        // double 4개짜리 배열을 만들고 이를 1.0, 2.0, 3.0, 4.0으로 초기화해보세요. ---------------

        // 1. 배열을 new로 만듦과 동시에 초기화
        double[] ar1 = new double[]{1.0, 2.0, 3.0, 4.0};

        // 2. 배열을 new로 만들고 이후에 값을 대입
        double[] ar2 = new double[4];
        ar2[0] = 1.0;
        ar2[1] = 2.0;
        ar2[2] = 3.0;
        ar2[3] = 4.0;

        // 3. sugar-code로 구현하는 방식(new 없이)
        double[] ar3 = {1.0, 2.0, 3.0, 4.0};

    }
}
