import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Printer prn = new LGPrinter();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("| 1. EPSON | 2. HP | 3. Samsung | 4. LG |");
        System.out.println("-----------------------------------------");
        System.out.printf("사용중인 프린터가 무엇인가요?> ");
        
        int type = scan.nextInt();

        Printer prn = null;

        switch(type) {

            case 1 :
                prn = new ESPrinter();
            break;

            case 2 :
                prn = new HPPrinter();
            break;

            case 3 :
                prn = new SSPrinter();
            break;

            case 4 :
            prn = new LGPrinter();
            break;

        }
        prn.init();
        prn.stop();
    }
}
