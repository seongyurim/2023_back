package ObjectClone_Rect;

// x, y 좌표를 저장하기 위한 클래스
// 클론을 오버라이딩 할 것이라면 implements Cloneable 반드시 선언
public class Point implements Cloneable {
    
    private int xPos; // x좌표
    private int yPos; // y좌표

    // 1-1. 기본생성자 ////////////////////////////////////////////////////////////
    public Point() {
        xPos = 0;
        yPos = 0;
    }

    // 1-2. 오버로딩 생성자
    public Point(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }


    // 2. Getter & Setter /////////////////////////////////////////////////////////
    public int getXPos() { return this.xPos; }
    public int getYPos() { return this.yPos; }
    public void setXPos(int xPos) { this.xPos = xPos; }
    public void setYPos(int yPos) { this.yPos = yPos; }


    // 3. equals() ////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        Point target;
        if (obj instanceof Point) {
            target = (Point)obj;
        } else{
            return false;
        }

        if ((false == (xPos == target.xPos)) || (false == (yPos == target.yPos))) {
            return false;
        }
        return true;
    }


    // 4. hashCode() //////////////////////////////////////////////////////////////
    @Override
    public int hashCode() {
        int hashCode = super.hashCode();
        return hashCode;
    }
    // 답이 return super.hashCode() + xPos + yPos 라면 super에 xPos, yPos를 더한 이유가 무엇일까?
    // (0, 10), (10, 0)은 값이 같으므로 더하는 의미가 없다. 차라리 위처럼 삭제하는 게 낫다.


    // 5. toString() //////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "{" +
            " xPos='" + getXPos() + "'" +
            ", yPos='" + getYPos() + "'" +
            "}";
    }


    // 6. clone() /////////////////////////////////////////////////////////////////
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // Primitive Type은 얕은복사여도 무관하므로 super만 사용해도 괜찮다.
}
