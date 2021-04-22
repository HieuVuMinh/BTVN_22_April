public class Main {
    public static void main(String[] args) {
        AccountManament accountManament = new AccountManament();
        MemberAccount account = accountManament.inputInfoAccount();
        accountManament.displayInfoAccount(account);
        accountManament.putSomeMoneyInAccount();
        accountManament.displayInfoAccount(account);
        accountManament.drawingMoney();
        accountManament.displayInfoAccount(account);


    }
}
