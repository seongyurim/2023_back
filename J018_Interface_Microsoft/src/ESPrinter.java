public class ESPrinter implements Printer {
        
    // 초기화
    @Override
    public boolean init() {
        System.err.println("EPSON init");
        return true;
    }

    // 출력
    @Override
    public boolean printer(String doc) {
        System.out.println("EPSON : " + doc);
        return true;
    }

    // 중지
    @Override
    public void stop() {
        System.out.println("EPSON stop");
    }
}
