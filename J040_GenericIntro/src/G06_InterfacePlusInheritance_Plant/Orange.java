package G06_InterfacePlusInheritance_Plant;

public class Orange extends Plants implements Eatable {

    @Override
    public void breed() { System.out.println("귤이 쑥쑥 자라나고 있어요."); }

    @Override
    public void eat() { System.out.println("귤을 먹어요."); }

    @Override
    public String toString() { return "저는 귤이라고 해요."; }
}
