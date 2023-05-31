package Example;
import java.util.Date;
import java.text.SimpleDateFormat;

public class E09_SimpleDateFormatExam {
    public static void main(String[] args) {
        
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now)); // 2023-05-31

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now)); // 2023년 05월 31일

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss"); // a는 오전/오후
        System.out.println(sdf.format(now)); // 2023.05.31 오후 14:10:32

        sdf = new SimpleDateFormat("오늘은 E요일"); // E는 요일
        System.out.println(sdf.format(now)); // 오늘은 수요일

        sdf = new SimpleDateFormat("올해의 D번째 날"); // D는 월 구분이 없는 일
        System.out.println(sdf.format(now)); // 올해의 151번째 날

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now)); // 이달의 31번째 날
    }
}
