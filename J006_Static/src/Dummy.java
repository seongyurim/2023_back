public class Dummy {

    static public int g = 30;
    private int a;

    public int getA() {
        return a;
    };
    public void setA(int a) {
        System.out.println(Dummy.g);
        this.a = a;
    };

}
