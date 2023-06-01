package G02_FruitBox;

public class DBox<L, R> {
    private L left;
    private R right;

    public void set(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getNum() {
        return left;
    }

    public R getFruit() {
        return right;
    }

    @Override
    public String toString() {
        return "left: " + left + ", right: " + right;
    }
}
