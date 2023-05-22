public class HPPrinter implements Printer {
        
    // 초기화
    @Override
    public boolean init() {
        System.out.println("HP Init");
        return true;
    }

    // 출력
    @Override
    public boolean printer(String doc) {
        System.out.println("HP : " + doc);
        return true;
    }

    // 중지
    @Override
    public void stop() {
        System.out.println("HP Stop");
    }
}
