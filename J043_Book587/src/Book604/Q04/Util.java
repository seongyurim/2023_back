package Book604.Q04;

public class Util {

    // private P pair;
    // private K key;

    // getValue() 메소드를 만들기 전에.. //
    // 이 메소드는 왜 특정 Value만을 받으려고 하는 걸까?
    // 그렇게 한정하지 않고 이것저것 다 들어올 수 있는 게 더 좋은 것 아닌가?
    // (일반칼과 맥가이버칼이 있다. 뭐가 더 좋은 걸까?)
    // OtherPair는 왜 굳이 버리는 걸까?
    // 제한을 하는 것이 올바르다. 왜냐하면
    // OtherPair가 항상 이렇게 생길 거라는 보장이 있나? 아니다. 얼마든지 바뀔 수 있다.
    // OtherPair의 내용이 바뀌었는데 아무 제한이 없다면 프로그램이 돌아가지 않을 수 있다.
    // 아무나 들어올 수 있다면 '공통적인' 것 밖에 할 수가 없다.
    // 전세계인이 모두 들어오는 마트가 있다면, 그곳에서는 돼지고기를 팔 수 없다. 무슬림 때문
    // 최대한 제한을 걸어줘야 그 안에서 자유로운 코딩이 가능한 것이다!!
    // 마트가 이것을 반영해서 "한국인만 오세요"라고 하면 판매상품을 자유롭게 구성할 수 있을 것이다.
    // 코드는 최대한 제한을 걸어서 컴팩트하게 가져가야 한다.
    // 제네릭은 아무거나 받으려고 존재하는 문법이 아니다.
    // 최소한으로 제한하려고 있는 것이다.
    
    public static <K, V> V getValue(Pair<K, V> pair, K key) {

        Pair result = new Pair<>();

        if (pair.getKey().equals(key)) {
            return pair.getValue();
        }
        else {
            return null;
        }
    }
}
