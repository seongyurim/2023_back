public class App {
    public static void main(String[] args) throws Exception {
       
        ListContainer lc = new ListContainer();

        lc.insertNode(new Node(11));
        lc.insertNode(new Node(22));
        lc.insertNode(new Node(33));
        lc.insertNode(new Node(44));
        lc.insertNode(new Node(55));
        lc.insertNode(new Node(66));

        // lc.getNode(0);

        lc.deleteNode(0);
        lc.deleteNode(1);

        lc.printAll(); // 오류발생..??
    }
}
