public class MemberAccount {
    private String accountName;
    private long accountNumber;
    private double amount;
    private double interestRates = 0.035;

    public MemberAccount(){
        this.amount = getAmount() + 50;
    }

    public MemberAccount( String accountName, long accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.amount = getAmount() + 50;
    }

    public MemberAccount(long accountNumber, String accountName, double amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount + 50;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", amount=" + this.amount +
                '}';
    }
}
