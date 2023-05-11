public class Gugudan_guide {
    public static void main(String[] args) {

        // 구구단을 출력하는 프로그램
        // 클래스를 이용해서 구현
        
        // 1. 사용자한테 dan을 입력받는다.
            // dan을 변수로 만들자... int dan
        // 2. dan을 이용해서 dan * 1, dan * 2, ... dan * 9까지 출력한다.
            // 출력함수도 만들자... printDan()


        Gugudan gu3 = new Gugudan();
        Gugudan gu5 = new Gugudan();
        // 여기에서 ()는 생성자(constructor)를 의미한다.
        // 자바는 생성자가 없는 경우 디폴트 생성자를 만들어버린다.
        // Gugudan gu5 = new Gugudan(); 의 의미
        // 1) Gugudan 객체를 Heap에 생성해라.
        // 2) Gugudan() 생성자를 호출해라.
        // 3) Gugudan 객체의 참조값을 gu에 저장해라. (변수가 없다면 임시참조변수에!)

        // new Gugudan();
        // 이 코드가 오류가 나지 않는 이유
        // 1) 2) 까지 실행이 마쳐졌는데 참조값을 넣을 곳만 없는 상태이다.
        // 따라서 임시참조변수를 만들어 그곳에 참조값을 넣었기 때문에 오류가 나지 않았다.

        gu3.setDan(3);
        gu5.setDan(5);
        gu3.printDan();
        gu5.printDan();


        // Overloaded Constructor
        Gugudan gu7 = new Gugudan(7);

        gu7.printDan();
        

    }
}
