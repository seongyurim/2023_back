public class SSPrinter implements Printer {
    
    // 초기화
    @Override
    public boolean init() {
        System.out.println("Samsung Init");
        return true;
    }

    // 출력
    @Override
    public boolean printer(String doc) {
        System.out.println("Samsung : " + doc);
        return true;
    }

    // 중지
    @Override
    public void stop() {
        System.out.println("Samsung Stop");
    }
}
