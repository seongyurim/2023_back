package G06_InterfacePlusInheritance_Plant;

public class Mushroom extends Plants {
    
    @Override
    public void breed() {
        System.out.println("버섯이 쑥쑥 자라나고 있어요.");
    }

    public void eat() {
        System.out.println("버섯을 먹어요.");
    }
}
