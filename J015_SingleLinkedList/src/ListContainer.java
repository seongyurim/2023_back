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

        // 앞노드-대상노드-뒷노드를 가지고 온다.
        Node prevNode = getNode(index - 1); // 앞노드
        Node presNode = getNode(index);     // 대상노드
        Node nextNode = getNode(index + 1); // 뒷노드

        if (index == 0) {
            // 헤더에 대상노드(index 0)의 뒷노드 참조값을 넣어서 연결한다.
            this.header = nextNode;

            // 대상노드(index 0)의 value, next 값을 없애서 연결을 끊는다.
            presNode.value = 0;
            presNode.next = null;

        } else { // ex. 22를 지우려면            
            // 앞노드(11)의 next에 뒷노드(33)의 참조값을 넣어서 연결한다.
            prevNode.next = nextNode;

            // 대상노드(22)의 value, next 값을 없애서 연결을 끊는다.
            presNode.value = 0;
            presNode.next = null;
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
        System.out.println("*** 노드리스트 전체를 출력합니다. ***");

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