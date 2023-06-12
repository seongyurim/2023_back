import java.util.HashMap;

public class C02_HashMapPractice {
    public static void main(String[] args) {

        // id, name으로 key, value가 구성된 map을 만들고
        // 데이터 3개를 넣고 출력해보세요.

        HashMap<String, String> user = new HashMap<>();

        // 추가하기
        user.put("mushroom", "주황버섯");
        user.put("ribbonPig", "리본돼지");
        user.put("greenSnail", "초록달팽이");

        // 꺼내기: get은 key로 가져온다.
        System.out.println(user.get("mushroom")); // 주황버섯
        System.out.println(user.get("ribbonPig")); // 리본돼지
        System.out.println(user.get("greenSnail")); // 초록달팽이

        // 삭제하기
        user.remove("greenSnail");
        System.out.println(user.get("greenSnail")); // null

    }
}
