package W04_MoveBox;

public class BoxHandler {

    // from에서 to로 T가 복사(move)되는 함수
    public static <T> void moveBox(Box<? super T> to, Box<? extends T> from) {

        to.set(from.get());

    }
}
