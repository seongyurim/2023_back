public class App {
    public static void main(String[] args) throws Exception {
       
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(11));
        lc.insertNode(new Node(22));
        lc.insertNode(new Node(33));

        // lc.getNode(0);

        lc.deleteNode(0);
    }
}
