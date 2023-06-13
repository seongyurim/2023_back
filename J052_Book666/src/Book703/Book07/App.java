package Book07;

import java.util.List;

public class App {
    public static void main(String[] args) {
        
        // DAO = Data Access Object
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
