public class Book16203 {
    
    public static void main(String[] args) {
        
        // for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드
    
        // 1. Attribute
        int num = 1;
        int total = 0;
    
        for (int i = 0; i < 100; i++) {
    
            // num이 3의 배수인지 판단
            if (num % 3 == 0) {

                // 3의 배수라면 누적시킨다.
                // System.out.println(total);
                total = total + num;
            }

            // num 증가
            num++;
            
        }

        System.out.println(total);
    
        // 3. Constructor
    
        // 2. Getter & Setter
    
        // 4. Method

    }

}
