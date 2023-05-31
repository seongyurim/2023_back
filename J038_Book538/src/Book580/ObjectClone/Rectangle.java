package ObjectClone;

// 사각형 클래스
// 클론을 오버라이딩 할 것이라면 implements Cloneable 반드시 선언
public class Rectangle implements Cloneable {
    
    private Point leftTop;
    private Point rightBottom;

    // 1-1. 기본생성자 ////////////////////////////////////////////////////////////
    public Rectangle() {
        leftTop = new Point();
        rightBottom = new Point();
    }

    // 1-2. 오버로딩 생성자
    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = new Point();
        this.rightBottom = new Point();
    }


    // 2. Getter & Setter /////////////////////////////////////////////////////////
    public Point getLeftTop()     { return this.leftTop; }
    public Point getRightBottom() { return this.rightBottom; }
    public void setLeftTop(Point leftTop)         { this.leftTop = leftTop; }
    public void setRightBottom(Point rightBottom) { this.rightBottom = rightBottom; }


    // 3. equals() ////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        Rectangle target;
        if (obj instanceof Rectangle) {
            target = (Rectangle)obj;
        } else {
            return false;
        }

        if ((false == (leftTop == target.leftTop)) ||
            (false == (rightBottom == target.rightBottom))) {
            return false;
        }
        return true;
    }


    // 4. hashCode() //////////////////////////////////////////////////////////////
    @Override
    public int hashCode() {
        Integer leftTop = null;
        Integer rightBottom = null;
        int hashCode = leftTop.hashCode() + rightBottom.hashCode();
        return hashCode;
    }


    // 5. toString() //////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "{" +
            " leftTop='" + getLeftTop() + "'" +
            ", rightBottom='" + getRightBottom() + "'" +
            "}";
    }


    // 6. clone() /////////////////////////////////////////////////////////////////
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle newObject = (Rectangle)super.clone();
        newObject.leftTop = this.leftTop;
        newObject.rightBottom = this.rightBottom;
        return newObject;
    }





    
    // 사각형의 넓이를 구하는 메소드
    // 사각형의 둘레를 구하는 메소드



}
