public class Account {
    
    private int balance = 0;
    private int MIN_BALANCE = 0;
    private int MAX_BALANCE = 1000000;

    public Account() {
        balance = 0;
        MIN_BALANCE = 0;
        MAX_BALANCE = 1000000;
    }

    // Getter
    public int getBalance()
    {
        return this.balance;
    };

    // Setter
    public void setBalance(int balance) {

        if ((balance >= MIN_BALANCE) && (balance <= MAX_BALANCE)) {
            this.balance = balance;
        }
    }
}
