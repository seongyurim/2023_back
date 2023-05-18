public class ListContainer {

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
        // ex. 22를 지우려면
        // 노드카운트를 통해 대상노드(22)의 앞노드(11), 뒷노드(33)를 가지고 온다.
        Node prevNode = getNode(index - 1);
        Node presNode = getNode(index);
        Node nextNode = getNode(index + 1);

        // 앞노드(11)의 next에 뒷노드(33)의 참조값을 넣어서 연결한다.
        prevNode.next = nextNode;

        // 대상노드(22)의 value(22)와 next(33의 참조값)을 없앤다.
        presNode.value = 0;
        presNode.next = null;
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
    public void printAll() {

    }




}