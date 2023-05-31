package J02_Wrapper;

public class Boxing {
    
    public static void boxingTest() {
        
        // Integer i = new Integer(10); // new가 원래 heap으로 올리는 방법이기는 하나

        Integer i = 10; // 이렇게 사용한다. 원래 이때 좌항의 i는 참조값을 가지는 변수이나 우항에 기본타입만 있다.
                        // 이것이 박싱(Boxing)이다. 리터럴값을 래퍼에 저장하기 위한 문법

        int k = i; // 언박싱(Unboxing): 래퍼 안의 값을 Primitive 타입에 저장하기 위한 문법
        System.out.println(i);
    }
}
