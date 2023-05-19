package J02_Sam;
public class ListContainer {
    // 연결리스트를 관리하기 위한 함수의 집합

    public Node header;
    public int nodeCount;


    // 마지막 노드를 구한다.
    private Node getLastNode() {
        Node target = header;
        if (nodeCount == 0) {
            return null;
        }
        for (int i = 0; i < nodeCount - 1; i++) {
            target = target.next;
        }
        return target;
    }


    // 노드를 추가한다.
    public boolean insertNode(Node node) {
        // 어디에 연결시킬지 결정해야 한다.
        // 노드의 개수가 0인 경우는 head에 넣고
        // 그렇지 않은 경우는 제일 마지막에 넣어준다.
        Node lastNode = null;
        if (nodeCount == 0) {
            header = node;
        } else {
            lastNode = getLastNode();
            lastNode.next = node;
        }
        nodeCount++;
        return true;
    }


    ////////////////////////////
    // public boolean deleteNode(Node node) {



    //     return true;
    // }


    // 인덱스에 해당하는 노드를 지운다.
    public boolean deleteNode(int index) {

        Node target = header; // 대상노드
        Node before = null;   // 앞노드

        if ((index < 0) || (index >= nodeCount)) {
            return false;
        }

        if (index == 0) {
            header = target.next;

        } else {
            for (int i = 0; i < index; i++) {
                before = target;
                target = target.next;
            }
            before.next = target.next;
        }
        nodeCount--;
        return true;
    }


    // 노드를 가지고 온다.
    public Node getNode(int index) {

        Node target = header;
        if ((index < 0) || (index >= nodeCount)) {
            return null;
        }

        // target을 찾는다.
        for (int i = 0; i < index; i++) {
            target = target.next;
        }

        // 노드를 만들고 target의 내용을 복사한다.
        Node node = new Node(target.value);
        return node;
    }


    // 옵션: 전체출력
    public boolean printAll() {
        System.out.println("*** 노드리스트를 출력합니다. ***");
        Node target = header;
        for (int i = 0; i < nodeCount; i++) {
            System.out.printf("%dth : %d, %s\n", i, target.value, target.next);
            target = target.next;
        }
        return true;
    }
}