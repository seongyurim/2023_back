package J01_MyOwn;

public class ListContainer {
    
    public Node head;     // 첫노드
    public Node tail;     // 끝노드
    public int nodeCount; // 노드의 갯수

    public ListContainer() {
        head = null;
        tail = null;
        nodeCount = 0;
    }


    ////// 추가 ///////////////////////////////////////////////////////////////////////
    
    // 1. 앞에 추가
    public boolean insertNodeToFirst(Node newNode) {

        if (nodeCount == 0) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

            // 다음에 가리킬 노드가 없는 경우 newNode = head = tail 이므로
            if (head.next == null) {
                tail = head;
            }
        }
        nodeCount++;
        return true;
    }

    // 2. 뒤에 추가
    public boolean insertNodeToLast(Node newNode) {

        if (nodeCount == 0) {
            insertNodeToFirst(newNode);
        }
        else {
            tail.next = newNode;
            newNode = tail;
            tail = newNode;
        }
        nodeCount++;
        return true;
    }

    // (특정 노드 가져오기)
    public Node getNode(int pos)
    {
        // 잘못된 범위인 경우
        if ((pos < 0) || (pos >= nodeCount))
            return null;

        Node target = head;

        for (int i = 0; i < pos; i++) {
            target = target.next;
        }
        return target;
    }

    // 3. 특정 위치에 추가
    public boolean insertNodeToPos(Node newNode, int pos) {

        // 잘못된 위치를 참조하는 경우
        if ((pos < 0) || (pos > nodeCount)) {
            return false;
        }

        // 추가하려는 위치가 가장 앞일 경우 insertNodetoFirst 호출 
        if (pos == 0) {
            insertNodeToFirst(newNode);
            return true;
        }

        // 추가하려는 위치가 마지막일 경우 insertNodetoLast 호출
        if (pos == nodeCount) {
            insertNodeToLast(newNode);
            return true;
        }

        // 추가하려는 위치의 이전노드
        Node prevNode = getNode(pos - 1);

        // 추가하려는 위치의 노드
        Node nextNode = prevNode.next;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = nextNode;

        nodeCount++;
        return true;
    }




    ////// 삭제 ///////////////////////////////////////////////////////////////////////

    // 1. 인덱스로 삭제
    public boolean deleteNodeByIndex (int index) {



        return true;
    }
    
    // 2. 키를 검색해서 삭제
    public boolean deleteNodeByKey (int key) {



        return true;
    }

    // 3. 문자로 삭제
    public boolean deleteNodeByValue (String value) {



        return true;
    }



    ////// 출력 ///////////////////////////////////////////////////////////////////////

    public boolean printAll() {
        
        System.out.println("*** 노드리스트를 출력합니다. ***");

        if (nodeCount == 0) {
            return false;
        }

        Node printNode = head;

        for (int i = 0; i < nodeCount; i++) {
            System.out.printf("%d번째 노드의 key: %d / value: %s\n", i+1, printNode.key, printNode.value);
            printNode = printNode.next;
        }
        return true;
    }

}
