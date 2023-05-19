package J02_Sam;
public class App {
    public static void main(String[] args) throws Exception {
       
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(11));
        lc.insertNode(new Node(22));
        lc.insertNode(new Node(33));

        // System.out.println(lc.getNode(0).value);
        // System.out.println(lc.getNode(1).value);
        // System.out.println(lc.getNode(2).value);

        lc.deleteNode(0);
        lc.deleteNode(0);
        lc.deleteNode(0);
        lc.printAll();
    }
}
