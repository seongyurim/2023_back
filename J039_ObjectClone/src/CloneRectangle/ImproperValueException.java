package CloneRectangle;

public class ImproperValueException extends Exception {
    
    public ImproperValueException() {
        super("부적절한 값이 입력되었습니다.");
    }

    public ImproperValueException(String message) {
        super(message);
    }
}
