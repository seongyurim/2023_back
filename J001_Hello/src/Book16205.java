public class Book16205 {
    public static void main(String[] args) {
        
        // 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드
        // 단, x와 y는 10 이하의 자연수입니다.
        for (int x = 1; x <= 10; x++) {
    
            for (int y = 1; y <= 10; y++) {
    
                if (60 == ((4*x) + (5*y))) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
    
            }
    
        }

        




        
    }





}
