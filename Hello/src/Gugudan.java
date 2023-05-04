public class Gugudan {
    
    private int dan; // private = JS의 #처럼 요소를 보호하는 장치



    // Defalut Constructor
    // 1) 클래스명과 동일한 이름으로 생성
    // 2) 리턴값이 없는 독특한 함수
    public Gugudan()
    {
        System.out.println("Dafault Constructor 호출");
        dan = 1;
    }

    // Overloaded Constructor
    public Gugudan(int dan)
    {
        System.out.println("Overloaded Constructor 호출");
        this.dan = dan;
    }


    public void setDan(int dan)
    {
        this.dan = dan;
    }

    public int getDan()
    {
        return dan;
    }

    public void printDan()
    {
        int m = 1;
        for (int i = 0; i < 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, m, (dan*m));
            m++;
        }
    }

}
