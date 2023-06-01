package ObjectClone_Rect;

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
    // 여기에 null을 넣으면 메모리 공간 할당 조차도 하지 않아 불안정한 상태가 되어 버린다.
    // 따라서 객체가 들어올 때에는 null이 아니라 인스턴스를 생성해주자.

    // 1-2. 오버로딩 생성자
    public Rectangle(Point leftTop, Point rightBottom) throws WrongPointException {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;

        if ((0 >= getWidth()) || (0 >= getHeight())) {
            throw new WrongPointException();
        }
    }

    public Rectangle(int left, int top, int right, int bottom) throws WrongPointException {
        this.leftTop = new Point(left, top);
        this.rightBottom = new Point(right, bottom);

        if ((0 >= getWidth()) || (0 >= getHeight())) {
            throw new WrongPointException();
        }




        // try {

        //     if ((0 >= right-left) || (0 >= bottom-top)) {
        //         throw new ImproperValueException();
        //     }
        // } catch (ImproperValueException e) {
        //     System.out.println(e.getMessage());
        // }
    }


    // 2. Getter & Setter /////////////////////////////////////////////////////////
    public Point getLeftTop()     { return this.leftTop; }
    public Point getRightBottom() { return this.rightBottom; }
    public void setLeftTop(Point leftTop)             { this.leftTop = leftTop; }
    public void setLeftTop(int left, int top)         { this.leftTop.setXPos(left);
                                                        this.leftTop.setYPos(top); }
    public void setRightBottom(Point rightBottom)     { this.rightBottom = rightBottom; }
    public void setRightBottom(int right, int bottom) { this.rightBottom.setXPos(right);
                                                        this.rightBottom.setYPos(bottom); }


    // 3. equals() ////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        Rectangle target = null;
        if (obj instanceof Rectangle) {

            target = (Rectangle)obj;

            if (false == leftTop.equals(target.leftTop)) {
                return false;
            }
    
            if (false == rightBottom.equals(target.rightBottom)) {
                return false;
            }
            return true;
        }
        return false;
    }


    // 4. hashCode() //////////////////////////////////////////////////////////////
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    // 5. toString() //////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "{" +
            " leftTop='" + getLeftTop().toString() + "'" +
            ", rightBottom='" + getRightBottom().toString() + "'" +
            "}";
    }
    // toString을 명시적으로 호출해주자.
    // 사실 toString을 넣지 않아도 결과는 같다.
    // 하지만 넣지 않으면 내부적으로(콜백으로) 호출되는 것이다.


    // 6. clone() /////////////////////////////////////////////////////////////////
    @Override
    public Object clone() throws CloneNotSupportedException {

        Rectangle cloneObject = (Rectangle)super.clone();

        // (1)
        cloneObject.leftTop = (Point)this.leftTop.clone();
        cloneObject.rightBottom = (Point)this.rightBottom.clone();

        // (2)
        // cloneObject.setLeftTop(new Point(leftTop.getXPos(), leftTop.getYPos()));
        // cloneObject.setRightBottom(new Point(rightBottom.getXPos(), rightBottom.getYPos()));
        return cloneObject;
    }




    // 메소드 /////////////////////////////////////////////////////////////////////

    // 사각형의 가로 길이
    public int getWidth() {
        int width = rightBottom.getXPos() - leftTop.getXPos();
        return width;
    }

    // 사각형의 세로 길이
    public int getHeight() {
        int height = leftTop.getYPos() - rightBottom.getYPos();
        return height;
    }

    // 사각형의 넓이
    public int getArea() {
        int area = getWidth() * getHeight();
        return area;
    }

    // 사각형의 둘레
    public int getPerimeter() {
        int perimeter = (getWidth() * 2) * (getHeight() * 2);
        return perimeter;
    }
}
