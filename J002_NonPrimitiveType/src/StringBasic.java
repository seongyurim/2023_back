public class StringBasic {
    public static void main(String[] args) {
        

        String name1 = "이순신"; // 우항에 new가 없네? Sugar-code!
        String name2 = new String("이순신");
        String name3 = "이순신";
        String name4 = new String("이순신");


        // 슈가코드는 슈가코드만의 매커니즘이 작동한다.
        // 슈가코드와 정상코드 간의 비교 = 다르다
        if (name1 == name2) {
            System.out.println("같다.");
        } else {
            System.out.println("다르다."); // 다르다
        }


        // 슈가코드 간의 비교 = 같다
        if (name1 == name3) {
            System.out.println("같다."); // 같다
        } else {
            System.out.println("다르다.");
        }


        // 정상코드 간의 비교 = 다르다
        // 슈가코드 매커니즘이 작동되지 않으므로 같다고 판단하지 않는다.
        if (name2 == name4) {
            System.out.println("같다.");
        } else {
            System.out.println("다르다."); // 다르다
        }


        // 따라서 비교를 위해서 == 을 사용하는 것은 적절하지 않다.
        // ==은 Non-primitive Type에는 아예 사용하지 말자!
        // (두 개의 비교대상이 슈가코드일 때만 사용 가능하지만, 이마저도 잘 사용하지 않으므로)


        // String을 비교하고 싶다면? equals 사용
        if (name1.equals(name2)) { // name1 = 기준, name2 = 대상(parameter)
            System.out.println("같다."); // 같다
        } else {
            System.out.println("다르다.");
        }


        System.out.println(name1.charAt(1)); // 순
        System.out.println(name1.length()); // 3
    }
}
