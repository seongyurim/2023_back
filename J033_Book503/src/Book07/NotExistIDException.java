package Book07;

public class NotExistIDException extends Exception {
    
    public NotExistIDException() {
        super("아이디가 존재하지 않습니다");
    }
    
    //정형화 된 오버로딩 생성자 코드
    public NotExistIDException(String message) {
        super(message);
    }
}
