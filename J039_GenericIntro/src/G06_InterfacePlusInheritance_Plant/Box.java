package G06_InterfacePlusInheritance_Plant;

public class Box<T extends Plants & Eatable> {
    
    private T plant;

    // 기본생성자
    public Box() {
        plant = null;
    }

    // 오버로딩 생성자
    public Box(T plant) {
        this.plant = plant;
    }

    // 세터
    public void set(T plant) {
        this.plant = plant;
    }

    // 게터
    public T get() {
        return plant;
    }

    @Override
    public String toString() {
        return plant.toString();
    }

    public void eatPlant() {
        plant.eat();
    }
}
