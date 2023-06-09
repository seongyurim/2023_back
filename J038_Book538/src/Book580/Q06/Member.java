package Q06;

public class Member {
    
    private String id;
    private String name;

    public Member() { }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId()  { return this.id; }
    public String getName() { return this.name; }
    public void setId(String id)     { this.id = id; }
    public void setName(String name) { this.name = name; }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
