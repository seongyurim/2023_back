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

    // (Key 중복여부 확인)
    private boolean isKeyExist(Node newNode) {

        Node target = head;
        // 들어온 노드의 키 값이 이미 존재하는지 확인
        for (int i = 0; i < nodeCount; i++) {
            if (target.getKey() == newNode.getKey()) {
                return true;
            }
            target = target.next;
        }
        return false;
    }
    
    // 1. 맨앞에 추가
    public boolean insertNodeToHead(Node newNode) {

        if (true == isKeyExist(newNode)) {
            return false;
        }

        if (nodeCount == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        nodeCount++;
        return true;
    }

    // 2. 맨뒤에 추가
    public boolean insertNodeToTail(Node newNode) {

        if (true == isKeyExist(newNode)) {
            return false;
        }

        if (nodeCount == 0) {
            insertNodeToHead(newNode);
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            nodeCount++;
        }
        return true;
    }

    // (특정 노드 가져오기)
    public Node getNode(int pos) {

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

        if (true == isKeyExist(newNode)) {
            return false;
        }

        // 추가하려는 위치가 0보다 작거나 같으면 맨앞에 추가
        if (pos <= 0) {
            insertNodeToHead(newNode);
            return true;
        }

        // 추가하려는 위치가 nodeCount보다 크거나 같으면 맨뒤에 추가
        else if (pos >= nodeCount) {
            insertNodeToTail(newNode);
            return true;
        }

        // 특정 위치에 추가
        else {
            Node prevNode = getNode(pos - 1); // 추가하려는 위치의 앞노드
            Node nextNode = prevNode.next;    // 추가하려는 위치의 뒷노드
    
            prevNode.next = newNode;
            nextNode.prev = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nodeCount++;
            return true;
        }
    }




    ////// 삭제 ///////////////////////////////////////////////////////////////////////

    // 1. position 값으로 삭제
    public boolean deleteNodeByPos (int pos) {

        // 노드가 존재하지 않는 경우
        if (nodeCount == 0) {
            return false;
        }

        // pos가 0보다 작거나 같으면 헤드 노드 삭제
        else if (pos <= 0) {
            head = head.next;
            nodeCount--;
            return true;
        }

        // pos가 nodeCount보다 크거나 같으면 테일 노드 삭제
        else if (pos >= (nodeCount - 1)) {
            tail.prev.next = null;
            tail = tail.prev;
            nodeCount--;
            return true;
        }

        // 특정 위치의 노드 삭제
        else {
            // 앞노드 - 삭제할 노드 - 뒷노드
            Node presNode = getNode(pos);  // 삭제할 노드
            Node prevNode = presNode.prev; // 앞노드
            Node nextNode = presNode.next; // 뒷노드

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            nodeCount--;
            return true;
        }
    }
    
    // 2. 키를 검색해서 삭제
    public boolean deleteNodeByKey (int key) {

        // 노드가 존재하지 않는 경우
        if (nodeCount == 0) {
            return false;
        }
        else {
            Node target = head;
            int targetPos = 0;
            for (int i = 0; i < nodeCount; i++) {
                if (target.getKey() == key) {
                    targetPos = i;
                    break;
                }
                target = target.next;
            }
            deleteNodeByPos(targetPos);
            return true;
        }
    }

    // 3. 문자(value)로 삭제
    //    1) bLike == false > 특정 문자열과 정확히 '일치'하는 노드 삭제
    //    2) bLike == true  > 특정 문자열을 '포함'하는 노드 삭제
    public boolean deleteNodeByValue (String value, boolean bLike) {

        Node target = head;

        // 특정 문자열과 '일치'하는 노드를 모두 지운다. (equals 사용)
        if (bLike == false) {
            for (int i = 0; i < nodeCount; i++) {
                if (true == target.getValue().equals(value)) {
                    deleteNodeByPos(i);
                    i--;
                }
                target = target.next;
            }
            return true;
        }

        // 특정 문자열을 '포함'하는 노드를 모두 지운다. (contains 사용)
        else if (bLike == true) {
            for (int i = 0; i < nodeCount; i++) {
                if (true == target.getValue().contains(value)) {
                    deleteNodeByPos(i);
                    i--;
                }
                target = target.next;
            }
            return true;
        }
        return false;
    }



    ////// 출력 ///////////////////////////////////////////////////////////////////////

    public boolean printAll() {
        
        System.out.println("*** 노드리스트를 출력합니다. ***");

        if (nodeCount == 0) {
            System.out.println("*** 노트리스트가 비어있어요. ***");
            return false;
        }
        else {
            Node target = head;
            for (int i = 0; i < nodeCount; i++) {
                System.out.printf("%d번째 노드의 key: %d / value: %s\n", i, target.key, target.value);
                target = target.next;
            }
            return true;
        }
    }
}
