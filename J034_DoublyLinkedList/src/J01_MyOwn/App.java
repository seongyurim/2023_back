package J01_MyOwn;

public class App {
    public static void main(String[] args) throws Exception {
        
        ListContainer lc = new ListContainer();
        
        ////// 추가 ///////////////////////////////////////////////////////////////////////

        lc.insertNodeToTail(new Node(11, "강아지"));           // 끝에 생성됨
        lc.insertNodeToHead(new Node(22, "강아지 & 고양이"));  // 앞에 생성됨
        lc.insertNodeToPos (new Node(33, "햄스터 & 팬더"), 1); // 인덱스 1 위치에 생성됨
        lc.insertNodeToTail(new Node(44, "강아지들"));         // 끝에 생성됨
        lc.insertNodeToTail(new Node(33, "기니피그"));         // 키값(33) 중복으로 생성 실패
        lc.insertNodeToPos (new Node(55, "쿼카 & 팬더"), 100); // 끝에 생성됨(nodeCount 초과)

        // 노드리스트가 아래의 순서대로 구성되었다.
        // 0번째 노드의 key: 22 / value: 강아지 & 고양이
        // 1번째 노드의 key: 33 / value: 햄스터 & 팬더
        // 2번째 노드의 key: 11 / value: 강아지
        // 3번째 노드의 key: 44 / value: 강아지들
        // 4번째 노드의 key: 55 / value: 쿼카 & 팬더



        ////// Pos로 삭제 /////////////////////////////////////////////////////////////////
    
        // lc.deleteNodeByPos(1);    // (33, 햄스터 & 팬더)가 삭제됨
        // lc.deleteNodeByPos(-100); // (22, 강아지 & 고양이)가 삭제됨
        // lc.deleteNodeByPos(100);  // (55, 쿼카 & 팬더)가 삭제됨



        ////// Key로 삭제 /////////////////////////////////////////////////////////////////

        // lc.deleteNodeByKey(33); // (33, 햄스터 & 팬더)가 삭제됨
        // lc.deleteNodeByKey(22); // (22, 강아지 & 고양이)가 삭제됨



        ////// Value로 삭제 ///////////////////////////////////////////////////////////////
        // 1) bLike == false > 특정 문자열과 일치하면 모두 삭제
        // 2) bLike == true  > 특정 문자열을 포함하면 모두 삭제

        // lc.deleteNodeByValue("강아지", false); // 일치
        // lc.deleteNodeByValue("강아지", true);  // 포함
        // lc.deleteNodeByValue("팬더", true);    // 포함

        lc.printAll(); // 출력
    }
}
