package Hospital;

public class App {
    
    public static void main(String[] args) {
        
        // 안과 환자 /////////////////////////////////////////////////////////////////////////////////
        ApartPatient p1 = new ApartPatient();
        p1.setName("john");
        p1.setWeight(80);
        p1.setGender("male");
        p1.setBlood("A");
        p1.setEyesight(1.2);

        System.out.println("***** p1 환자 정보 출력 *****");
        System.out.println(p1.getName());       // 환자 클래스의 메소드
        System.out.println(p1.getEyesight());   // 안과환자 클래스의 메소드


        ApartPatient p2 = new ApartPatient("Paul", "male", 76, "B", 0.8);

        System.out.println("***** p2 환자 정보 출력 *****");
        System.out.println(p2.getName());       // 환자 클래스의 메소드
        System.out.println(p2.getEyesight());   // 안과환자 클래스의 메소드

        
        System.out.println("***** checkMedical 메소드 실행 *****");
        p2.checkMedical();

        System.out.println("***** checkMedicalforSurgery 메소드 실행 *****");
        p2.checkMedicalforSurgery();





        // 산부인과 환자 //////////////////////////////////////////////////////////////////////////////
    }
}
