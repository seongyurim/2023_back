import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_Quiz {
    public static void main(String[] args) {
        
        // 이 데이터를 리스트에 집어넣고 출력하는 코드를 만들어보자
        int[] data = {10, 20, 100, 54, 34, 0};

        List<Integer> list = new ArrayList<>();
        
        // data 배열 요소를 list에 추가
        for(int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        // list 출력
        for (Integer num : list) {
            System.out.printf("%d ", num);
        }

        
        // 다른 방법으로도 만들 수 있다. (알아만 두기) ///////////////////////////////////////////
        
        Integer[] data2 = {10, 20, 100, 54, 34, 0};
        List<Integer> list2 = Arrays.asList(data2); // 주의점: Primitive Type(int)은 사용할 수 없음

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        
        String[] data3 = {"ab", "cd", "ef"};
        List<String> list3 = Arrays.asList(data3);

        // for (int i = 0; i < list3.size(); i++) {
        //     System.out.println(list3.get(i));
        // }

        // 위의 for문 대신 반복자로 순회시키기~!
        Iterator<String> iter = list3.iterator();
        while(iter.hasNext()) {            
            System.out.println(iter.next());
        }
    }
}
