package Book604.Q04;

public class UtilExam {
    public static void main(String[] args) {
        
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동"); // 일치
        System.out.println(age); // 35

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순"); // 불일치
        System.out.println(childAge); // null

    }
}
