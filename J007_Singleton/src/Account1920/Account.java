package Account1920;

public class Account {
    
    // Attribute
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;
    private String accountNum;
    private String name;
    private int payment;


    // Default Constructor
    public Account() {
        accountNum = "";
        name = "";
        payment = 0;
        balance = 0;
    }
    

    // Getter
    public String getAccountNum() { return accountNum; };
    public String getName()       { return name; };
    public int getPayment()       { return payment; };
    public int getBalance()       { return balance; };

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
