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


    // 노드를 지운다.
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
        Node findNode = header;
        if (nodeCount == 0) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            findNode = findNode.next;
        }
        return findNode;
    }


    // 옵션: 전체출력
    public boolean printAll() {
        System.out.println("*** 노드리스트를 출력합니다. ***");

        if (nodeCount == 0) {
            System.out.println("츨력할 노드가 없어요!"); // 체크용 임시메세지
            return false;
        }

        Node printNode = header;
        for (int i = 0; i < nodeCount; i++) {
            System.out.println(printNode.value);
            printNode = printNode.next;
        }
        return true;
    }

}