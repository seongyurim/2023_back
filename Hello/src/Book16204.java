public class Book16204 {
    public static void main(String[] args) {
        
        // while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1.눈2) 형태로 출력하고,
        // 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드
        // 눈의 합이 5가 되는 경우: (1.4), (4.1), (2.3), (3.2)


        
        int dice1 = 0;
        int dice2 = 0;
        
        // 1. 주사위 두 개를 던진다.
        while (true) {
            
            // 2. 주사위의 합이 5면 밖으로 나간다. 
            if (5 == (dice1 + dice2))
            {
                break;
            }

            dice1 = ((int)(Math.random()*6)) + 1;
            dice2 = ((int)(Math.random()*6)) + 1;      
            System.out.printf("(%d.%d)\n", dice1, dice2);
        }
        
    }
}
