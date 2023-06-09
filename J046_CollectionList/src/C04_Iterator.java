import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class C04_Iterator {
    public static void main(String[] args) {
        
        // 이 데이터를 리스트에 집어넣고 출력하는 코드를 만들어보자
        int[] data = {10, 20, 100, 54, 34, 0};

        List<Integer> list = new ArrayList<>();
        
        // data 배열 요소를 list에 추가
        for(int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        // Iterator ////////////////////////////////////////////////////

        // 1. 반복자를 만든다.
        Iterator<Integer> iter = list.iterator();

        // 2. 반복자를 이용해서 데이터를 가지고 온다. (전형적인 코드)
        while(iter.hasNext()) {            
            System.out.println(iter.next());
        }

        System.out.println("*** 반복자 1회 사용 완료 ***");

        // 3. 필요하다면 다시 만들어서 가지고 온다.
        iter = list.iterator();
        while(iter.hasNext()) {            
            System.out.println(iter.next());
        }

        System.out.println("*** 반복자 2회 사용 완료 ***");

    }
}
