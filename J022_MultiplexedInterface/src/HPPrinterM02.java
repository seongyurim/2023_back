public class HPPrinterM02 implements ColorPrintable { // 프린트가능, 스캔불가능
    
    public void print(String doc) {
        System.out.println("mono print : " + doc);
    }

    public void colorPrint(String doc) {
        System.out.println("color print : " + doc);
    }
}
