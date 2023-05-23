public class Com implements Friends {
    
    // Attribute
    private String name;
    private String phone;
    private String dept;

    // Default Constructor
    public Com() {
        dept = null;
    }

    // Overloaded Constructor
    public Com(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
    }

    // Show Method
    @Override
    public void show() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("dept : " + dept);
    }
}
