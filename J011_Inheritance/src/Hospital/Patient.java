package Hospital;

public class Patient {
    
    // Attribute
    private String name;
    private String gender;
    private double weight;
    private String blood;

    // Default Constructor
    public Patient() {
        name = null;
        gender = null;
        weight = 0;
        blood = null;
        System.out.println("Patient() - Constructor");
    }

    // Overloaded Constructor
    public Patient(String name, String gender, double weight, String blood) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.blood = blood;
        System.out.println("Overloaded Patient() - Constructor");
    }

    // Getter
    public String getName()   { return this.name; }
    public String getGender() { return this.gender; }
    public double getWeight() { return this.weight; }
    public String getBlood()  { return this.blood; }

    // Setter
    public void setName(String name)     { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setWeight(double weight) {this.weight = weight; }
    public void setBlood(String blood)   { this.blood = blood; }



    public void checkMedical() {
        System.out.println("혈액형을 검사합니다.");
        System.out.println("체중을 검사합니다.");
    }
}
