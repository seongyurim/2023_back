package Book07;

import java.util.*;

public class BoardDao {

    public List<Board> list;

    public List<Board> getBoardList() {

        list = new LinkedList<>();

        if(list.isEmpty()) {
            list.add(new Board("제목1", "내용1"));
            list.add(new Board("제목2", "내용2"));
            list.add(new Board("제목3", "내용3"));
        }
        return list;
    }
}
