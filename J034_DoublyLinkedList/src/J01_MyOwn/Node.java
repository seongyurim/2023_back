package J01_MyOwn;

public class Node {
    
    public int key;
    public String value;
    public Node prev;
    public Node next;

    public Node() {
        key = 0;
        value = null;
        prev = null;
        next = null;
    }

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }

}
