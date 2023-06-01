package G06_InterfacePlusInheritance_Plant;

public class Apple extends Plants implements Eatable {

    @Override
    public void breed() {
        System.out.println("사과가 쑥쑥 자라나고 있어요.");
    }

    @Override
    public void eat() {
        System.out.println("사과를 먹어요.");
    }

    @Override
    public String toString() {
        return "저는 사과라고 해요.";
    }
}
