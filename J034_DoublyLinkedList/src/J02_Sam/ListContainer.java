package J02_Sam;

public class ListContainer {
    


    private Node header;

    public ListContainer() {}

    public Node getHeader() {
        return this.header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    // 추가
    // 앞에, 뒤에, 특정 위치에
    // return: 추가한 위치 인덱스, 추가 실패한 경우 -1
    public int insertNode(Node newNode, int pos) {

        return -1;
    }

    public int insertNode(int key, String value, int pos) {
        return insertNode(new Node(key, value), pos);
    }



    // 삭제
    // 1) 문자(value)로 삭제
    // bLike = false > 정확하게 동일한 문자열만 지운다.
    //       = true  > value를 포함한 노드까지 지운다.
    public boolean deleteNodeByValue(String value, boolean bLike) {

        // abc를 지워라
        // abc가 포함된 value를 지워라

        return false;
    }

    // 2) 



}
