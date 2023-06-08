package W02_AddBox;

public class Exam {
    
    public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3) {

        // 전임자 의도: b1 + b2를 합한 값을 b3에 넣을 것이다.
        b3.set(b1.get() + b2.get());

        // 후임자 코드: 전임자의 의도와 어긋나므로 컴파일 에러 발생시키기
        // b1, b2에 ? extends Integer를 선언하여 Read Only로 만듦 // extends = get만 가능, set이 불가능
        // b3에     ? super Integer를 선언하여 Write Only로 만듦  // super = set만 가능, get이 불가능
        // b1.set(b2.get() + b3.get()); // error
        // b2.set(b1.get() + b3.get()); // error
    }
}
