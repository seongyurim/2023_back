public class Book184 {
    public static void main(String[] args) {
        
        // 문자열 찾기 = indexOf() or contains()

        String subject = "자바 프로그래밍";
        
        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3
        
        String substring = subject.substring(location);
        System.out.println(substring); // 프로그래밍
        

        // indexOf() = 주어진 문자열이 시작되는 인덱스를 리턴
        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요."); // printed
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }


        // contains() = 단순히 문자열이 포함되어 있는지 여부만 true/false로 리턴
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요."); // printed
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
