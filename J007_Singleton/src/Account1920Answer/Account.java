package Account1920Answer;

public class Account {
   
    private String number;     // 계좌번호
    private String name;       // 계좌주
    private int balance;       // 잔액


    public Account() {
        number = "";
        name = "";
        balance = 0;
    }

    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber()     { return this.number; };
    public String getName()       { return this.name; };
    public int getBalance()       { return this.balance; };

    // public void setNumber(String number)   { this.number = number; }; // 있으면 안되니 삭제!
    public void setName(String name)       { this.name = name; };
    public void setBalance(int balance)    { this.balance = balance; };

}
