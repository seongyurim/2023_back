public class Book16205 {
    public static void main(String[] args) {
        
        // 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드
        for (int x = 0; x < 10; x++) {
    
            for (int y = 0; y < 10; y++) {
    
                if (((4*x) + (5*y)) == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
    
            }
    
        }






        
    }





}
