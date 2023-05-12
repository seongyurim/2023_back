public class Account {
    
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance = 0;

    public Account() {
        balance = 0;
    }

    // Getter
    public int getBalance() { return this.balance; };

    // Setter
    public boolean setBalance(int balance) {

        if ((balance < Account.MIN_BALANCE) ||
            (balance > Account.MAX_BALANCE)) {
            return false;
        }
        this.balance = balance;
        return true;
    }

}
