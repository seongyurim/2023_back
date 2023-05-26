package J02_Sam;

public class Node {

    public static final int START = Integer.MIN_VALUE;
    public static final int END   = Integer.MAX_VALUE;
    
    private int key;
    private String value;
    private Node prev;
    private Node next;

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

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }   

}
