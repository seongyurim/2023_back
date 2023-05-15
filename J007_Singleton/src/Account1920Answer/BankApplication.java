package Account1920Answer;

// BankApplication의 역할은 Account, 즉 계좌 관리를 하는 것이다.
// 메뉴 띄워주기가 앱의 역할인가? 아닐 것이다. 바뀔 수 있기 때문이다.
public class BankApplication {
        
    // Account : 관리대상, 독립적
    // BankApplication : 관리자이자 컨테이너(관리대상을 포함), Account에게 종속적

    // 속성
    private int count;              // Account Object의 갯수
    private int Max;                // Account의 최대치
    private Account[] account;      // 계좌정보들이 들어가는 배열

    // 기본 생성자
    public BankApplication() {
        count = 0;
        Max = 0;
        account = null;
    }
    
    // 오버로딩 생성자: count만큼 생성
    public BankApplication(int max) {
        count = 0;
        Max = max;
        account = new Account[max];

        // test-code ///////////////////////////////////////
        account[0] = new Account("111-111", "abc", 10000);
        account[1] = new Account("222-222", "def", 20000);
        account[2] = new Account("333-333", "efg", 30000);
        account[3] = new Account("444-444", "oqp", 40000);
        count = 4;
        ////////////////////////////////////////////////////
    }

    // Getter
    public int getMax()   { return this.Max; }
    public int getCount() { return count; }



    ////// 1. 계좌생성 /////////////////////////////////////////////////////////////////////
    public boolean createAccount(Account account) {
        int pos = this.getEmptySlot();
        
        // account가 없거나 최대치이면 false를 리턴
        if ((account == null) || (pos == -1)) {
            return false;
        }
        this.account[pos] = account;
        count++;
        return true;
    }
    
    public boolean createAccount(String number, String name, int balance) {
        Account ac = new Account(number, name, balance);
        return createAccount(ac);
    }

    // Account 배열에서 처음으로 만나는 null의 위치(i)를 리턴
    private int getEmptySlot() {
        for (int i = 0; i < Max; i++) {
            if (account[i] == null) {
                return i;
            }
        }
        return -1;
    }



    ////// 2. 계좌삭제 /////////////////////////////////////////////////////////////////////
    public boolean deleteAccount(String number) {
        int targetIndex = -1;
        targetIndex = findAccountIndex(number);

        if (targetIndex == -1) {
            return false;
        }
        // 위치에 null을 넣어준다.
        account[targetIndex] = null;   
        count--;     
        return true;
    }



    ////// 3. 계좌목록 /////////////////////////////////////////////////////////////////////
    public Account getAccount(int index) {
        if (account[index] == null) {
            return null;
        }

        return new Account(account[index].getNumber(),
                           account[index].getName(),
                           account[index].getBalance());
    }



    ////// 4. 입금하기 /////////////////////////////////////////////////////////////////////
    public boolean deposit(String number, int balance) {
        int index;
        int curBalance;

        index = findAccountIndex(number);

        if (index == -1) {
            return false;
        }
        curBalance = account[index].getBalance(); // 현재 잔액 가져오기
        account[index].setBalance(curBalance + balance);
        return true;
    }

    // Account[] 배열 속 특정 Account의 인덱스를 찾아서 리턴
    private int findAccountIndex(String number) {
        for (int i = 0; i < Max; i++) 
        {
            if (account[i] != null) {

                if (account[i].getNumber().equals(number)) 
                {
                    return i;
                }
            }            
        }
        return -1;
    }



    ////// 5. 출금하기 /////////////////////////////////////////////////////////////////////
    public boolean withdraw(String number, int balance) {
        int index;
        int curBalance;

        index = findAccountIndex(number);

        if (index == -1) {
            return false;
        }

        curBalance = account[index].getBalance(); // 현재 잔액 가져오기

        if (curBalance < balance) {
            return false;
        }
        account[index].setBalance(curBalance - balance);
        return true;
    }
}
