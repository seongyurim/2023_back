package L01_Intro;
public class Printer implements Printable {

    public int a;
    
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
