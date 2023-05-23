// 마이크로소프트가 상호규약을 위해 배포합니다.
// 이 양식대로 만들어서 제출 바랍니다.
interface Printer {
    public boolean init();
    public boolean printer(String doc);
    public void stop();

    // 인터페이스
    // 1. 규약을 '강제'로 사용하도록 만든다.
    // 2. 인터페이스는 순수히 '규약'으로만 이루어져 있다.
    //    - 이와 달리 추상클래스에서는 규약용 메소드와 호출용 메소드가 혼재될 수 있었다.
    // 파일명은 보통 ~able(~할 수 있는)로 지정한다. ex. Printerable
}
