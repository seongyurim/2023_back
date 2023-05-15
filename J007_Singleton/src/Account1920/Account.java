package Account1920;

public class Account {
    
    // Attribute
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private String accountNum;
    private String owner;
    private int balance;


    // Default Constructor
    public Account() {
        accountNum = "";
        owner = "";
        balance = 0;
    }

    // Overloaded Constructor
    public Account(String accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }
    

    // Getter
    public String getAccountNum() { return accountNum; };
    public String getOwner()       { return owner; };
    public int getBalance()       { return balance; };


    // Setter
    public void setAccountNum(String accountNum) { this.accountNum = accountNum; };
    public void setOwner(String owner) { this.owner = owner; };
    public void setBalance(int balance) {
        if ((balance > Account.MIN_BALANCE) &&
            (balance < Account.MAX_BALANCE)) {
            this.balance = balance;
        }
    }

}
