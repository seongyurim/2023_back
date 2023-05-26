package J01_MyOwn;

public class App {
    public static void main(String[] args) throws Exception {
        
        ListContainer lc = new ListContainer();

        lc.insertNodeToFirst(new Node(11, "첫번째 노드"));
        lc.insertNodeToFirst(new Node(22, "두번째 노드"));
        lc.insertNodeToFirst(new Node(33, "세번째 노드"));
    }
}
