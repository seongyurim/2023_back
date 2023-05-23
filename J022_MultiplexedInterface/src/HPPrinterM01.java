public class HPPrinterM01 implements Printerable, Scannable { // 프린트가능, 스캔가능
    
    public void print(String doc) {
        System.out.println("mono print : " + doc);
    }

    public void scan(String doc) {
        System.out.println("scan : " + doc);
    }
}
