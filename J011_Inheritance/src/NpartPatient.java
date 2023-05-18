import com.acompany.Patient.Patient;

public class NpartPatient extends Patient {

    // 내과 환자
    private double waist; // 허리둘레

    // Default Constructor
    public NpartPatient() {
        waist = 0;
    }

    // Getter & Setter
    public double getWaist()           { return this.waist; }
    public void setWaist(double waist) { this.waist = waist; }
}
