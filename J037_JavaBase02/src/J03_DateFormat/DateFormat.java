package J03_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    
    public static void DateFormatTest() {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // month, minute을 구분하기 위해 month는 대문자 사용
        
        System.out.println(sdf.format(now) + " 입니다.");

        // System.out.println(now.getClass());

    }
}
