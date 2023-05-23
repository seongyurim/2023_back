package Book06;

public class Child extends Parent {
    
    public int studentNo;

    // 기본생성자가 없는 상태여서 만들었음
    public Child() {
        studentNo = 0;
    }
    
    // 여기서 발생한 오류 수정하기
    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    // name은 부모클래스인 Parent의 속성이기 때문에
    // this.name이 아니라 super를 사용하여 명시적으로 표기해야 한다.
}
