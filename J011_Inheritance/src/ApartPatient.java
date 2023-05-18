

import com.acompany.Patient.Patient;

public class ApartPatient extends Patient {
    
    // 안과 환자 Attribute
    private double eyesight; // 시력

    // Default Constructor
    public ApartPatient() {
        super();
        eyesight = 0;
        System.out.println("ApartPatient() - Constructor");
    }

    // Overloaded Constructor
    public ApartPatient(String name, String gender, double weight, String blood, double eyesight) {
        super(name, gender, weight, blood);
        this.eyesight = eyesight;
    }

    // Getter & Setter
    public double getEyesight()              { return this.eyesight; }
    public void setEyesight(double eyesight) { this.eyesight = eyesight; }

    @Override // 이 오버라이딩용 메소드가 잘 만들어지지 않았다면 알려줘
    public void checkMedical() {
        System.out.println("안구를 검사합니다.");
        System.out.println("시력을 검사합니다.");
    }

    public void checkMedicalforSurgery() {
        // Patient.checkMedical(); // error // 이미 현재 클래스에서 오버라이드되었기 때문이다.
        super.checkMedical(); // 따라서 이렇게 가져와야 한다.
        checkMedical(); // 이것은 현재 클래스의 메소드이다.
    }
}
