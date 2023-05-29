package J01_MyOwn;

public class App {
    public static void main(String[] args) throws Exception {
        
        ListContainer lc = new ListContainer();

        lc.insertNodeToLast(new Node(11, "강아지"));
        lc.insertNodeToLast(new Node(22, "강아지 & 고양이 & 팬더"));
        lc.insertNodeToPos(new Node(33, "햄스터 & 팬더"), 1);
        lc.insertNodeToLast(new Node(44, "강아지"));
        lc.insertNodeToLast(new Node(33, "기니피그"));

        // lc.deleteNodeByIndex(0);
        // lc.deleteNodeByIndex(0);
        // lc.deleteNodeByIndex(0);
        // lc.deleteNodeByIndex(0);

        // lc.deleteNodeByKey(11);
        // lc.deleteNodeByKey(33);
        // lc.deleteNodeByKey(22);
        // lc.deleteNodeByKey(44);

        // lc.deleteNodeByValue("강아지", false); // 일치
        // lc.deleteNodeByValue("강아지", true); // 포함
        // lc.deleteNodeByValue("팬더", true); // 포함

        lc.printAll();
    }
}
