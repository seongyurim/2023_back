package CloneRectangle;

public class App {
    public static void main(String[] args) throws Exception {
        
        Rectangle rect1 = new Rectangle(90, 10, 10, 100);
        Rectangle rect2 = new Rectangle(10, 10, 100, 100);
        Rectangle rect3 = (Rectangle)rect1.clone();
        rect1.equals(rect2);

        System.out.println("rect1 : " + rect1);
        System.out.println("rect2 : " + rect2);
        System.out.println("rect3 : " + rect3);


        Rectangle rect4 = null;
        try {
            // 객체 생성 시 잘못된 point 값을 넣으면 예외 발생
            rect4 = new Rectangle(90, 10, 10, 100);           
        } catch(WrongPointException e) {
            e.printStackTrace();
            return;
        }

    }
}
