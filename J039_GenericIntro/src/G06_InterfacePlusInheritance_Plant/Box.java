package G06_InterfacePlusInheritance_Plant;

public class Box<T extends Plants & Eatable> {
    // 클래스(상속)와 인터페이스가 혼합되면 클래스가 먼저 나와야 한다.

    private T plants;

    // 기본생성자
    public Box() {
        plants = null;
    }

    // 오버로딩 생성자
    public Box(T plants) {
        this.plants = plants;
    }

    // 세터
    public void set(T plants) {
        this.plants = plants;
    }

    // 게터
    public T get() {
        return plants;
    }

    @Override
    public String toString() {
        return plants.toString();
    }

    public void eatPlants() {
        // 구현된 인터페이스를 호출
        plants.eat();
    }

    public void makeEnergy() {
        // 부모 클래스의 메소드를 호출
        System.out.printf("에너지를 %d만큼 만들었어요.\n", plants.getEnergy());
    }
}
