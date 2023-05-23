public class Univ implements Friends {
    
    // Attribute
    private String name;
    private String phone;
    private String major;

    // Default Constructor
    public Univ() {
        major = null;
    }

    // Overloaded Constructor
    public Univ(String name, String phone, String major) {
        this.name = name;
        this.phone = phone;
        this.major = major;
    }

    // Getter & Setter
    public String getDept() { return this.major; }
    public void setDept(String major) { this.major = major; }

    // Show Method
    @Override
    public void show() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("major : " + major);
    }
}
