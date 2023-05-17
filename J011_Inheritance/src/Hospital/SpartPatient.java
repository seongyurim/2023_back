package Hospital;

public class SpartPatient extends Patient {
    
    // 산부인과
    private boolean pregnant; // 임신여부

    // Default Constructor
    public SpartPatient() {
        pregnant = false;
    }

    // Getter & Setter
    public boolean getPregnant()              { return this.pregnant; }
    public void setPregnant(boolean pregnant) { this.pregnant = pregnant; }
}
