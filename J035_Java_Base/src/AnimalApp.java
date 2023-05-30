public class AnimalApp {
    public static void main(String[] args) {
        
        Animal ani = new Animal(1, "강아지", 3.6, "white");

        System.out.println(ani.getId());
        System.out.println(ani.getName());
        System.out.println(ani.getWeight());
        System.out.println(ani.getColor());
    }
}
