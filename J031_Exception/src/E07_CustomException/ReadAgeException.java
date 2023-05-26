package E07_CustomException;

public class ReadAgeException extends Exception {
    
    public ReadAgeException() {
        super("유효하지 않은 나이 범위입니다.");
    }
}
