import java.util.Comparator;
import java.util.TreeSet;

public class Book690 {
    
    public static class Fruit {

        public String name;
        public int price;

        public Fruit() {
            name = "";
            price = 0;
        }

        public Fruit(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static class FruitComparator implements Comparator<Fruit> {

        @Override
        public int compare(Fruit obj1, Fruit obj2) {
            if (obj1.price < obj2.price) {
                return -1;
            }
            else if (obj1.price > obj2.price) {
                return 1;
            }
            else { // obj1.price = obj2.price
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        
        TreeSet<Fruit> set = new TreeSet<>(new FruitComparator());

        set.add(new Fruit("포도", 3000));
        set.add(new Fruit("수박", 9000));
        set.add(new Fruit("딸기", 6000));

        for (Fruit fruit : set) {
            System.out.println(fruit.name + ": " + fruit.price + "원");
        }
    }
}
