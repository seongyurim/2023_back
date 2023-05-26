package J02_Sam;

public class App {
    public static void main(String[] args) {
        
        ListContainer lc = new ListContainer();

        Node node = new Node(1, "abc");
        lc.insertNode(node, Node.START);
        lc.insertNode(node, Node.END);
        lc.insertNode(node, 3);

        lc.insertNode(12, "abc", Node.START);
    }
}
