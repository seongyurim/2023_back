import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 오버로딩 생성자
public class Animal {

    private int    id;
    private String name;
    private double weight;
    private String color;

}
