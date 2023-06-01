package G04_FruitBox_BoxInBox;

public class Box<T> {
    
    private T fruit;

    public Box() {
        fruit = null;
    }

    public Box(T fruit) {
        this.fruit = fruit;
    } // 아래 세터와 동일한 모양이네

    public void set(T fruit) {
        this.fruit = fruit;
    }

    public T get() {
        return fruit;
    }

    @Override
    public String toString() {
        return fruit.toString();
    }
}



// public class Box<A, B> {
//     private A apple;
//     private B banana;

//     public void set(A apple, B banana) {
//         this.apple = apple;
//         this.banana = banana;
//     }

//     public A getLeft()  { return apple; }
//     public B getRight() { return banana; }
//     public void setLeft(A apple)   { this.apple = apple; }
//     public void setRight(B banana) { this.banana = banana; }

// }
