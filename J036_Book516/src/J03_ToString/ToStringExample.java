package J03_ToString;

public class ToStringExample {
    public static void main(String[] args) {
        
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj); // 삼성전자, 안드로이드

        System.out.println(myPhone); // 삼성전자, 안드로이드

    }
}
