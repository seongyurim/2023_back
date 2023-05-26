package Book07;

public class WrongPasswordException extends Exception {
    
    public WrongPasswordException() {
        super("패스워드가 틀립니다.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
