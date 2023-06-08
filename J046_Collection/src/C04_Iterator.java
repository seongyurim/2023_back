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
        // 반복자는 해당 자료구조에 iterator() 메소드를 호출하여 얻는다.
        // 반복자의 타입 파라미터가 Integer여야 한다.
        // 반복자는 막대기같은 것이다. 처음 생성되면 리스트 밖(맨앞)에서 막대기가 대기하고 있다.
        // 반복자는 뒤로는 가지 않는다. 무조건 next.
        // 반복자는 재활용할 수 없다. 순환이 끝났는데 또 순환이 필요하면 다시 받아와야 한다.
        // 반복자가 뒤로 간다면? 한번 찍힌 요소가 또 찍히기 때문이다.
        // 양방향 반복자(ListIterator)가 있기는 하다. 하지만 실무에서는 거의 사용하지 않는다. 쓰지 말자.
        Iterator<Integer> iter = list.iterator();

        // 2. 반복자를 이용해서 데이터를 가지고 온다. (전형적인 코드)
        while(iter.hasNext()) {            
            System.out.println(iter.next());
        }

        System.out.println("*** 반복자 1회 사용 완료 ***");

        iter = list.iterator();
        while(iter.hasNext()) {            
            System.out.println(iter.next());
        }

        System.out.println("*** 반복자 2회 사용 완료 ***");

    }
}
