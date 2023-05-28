package J01_MyOwn;

public class Node {
    
    // Attribute
    public int key;
    public String value;
    public Node prev;
    public Node next;

    // Default Constructor
    public Node() {
        key = 0;
        value = null;
        prev = null;
        next = null;
    }

    // Overloaded Constructor
    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }

    // Getter
    public int getKey()      { return this.key; }
    public String getValue() { return this.value; }

    // Setter
    public void setKey(int key)        { this.key = key; }
    public void setValue(String value) { this.value = value; }

}
