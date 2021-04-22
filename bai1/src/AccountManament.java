import java.util.Scanner;

public class AccountManament {
    Scanner sc = new Scanner(System.in);
    MemberAccount memberAccount = new MemberAccount();

    public AccountManament() {
    }

    // Nhập thông tin tài khoản
    public MemberAccount inputInfoAccount() {
        System.out.println("Nhập thông tin tài khoản");
        System.out.println("Nhập tên tài khoản");
        String name = sc.nextLine();
        System.out.println("Nhập số tài khoản");
        long accountNumber = sc.nextByte();
        MemberAccount memberAccount = new MemberAccount(name, accountNumber);
        return memberAccount;
    }

    // Hiển thị thông tin tài khoản
    public void displayInfoAccount(MemberAccount account) {
        System.out.println(memberAccount.toString());
    }

    //Nạp tiền vào tài khoản
    public void putSomeMoneyInAccount() {
        System.out.println("Nhập số tiền muốn gửi vào: ");
        double deposit = sc.nextDouble();
        double amount = memberAccount.getAmount();
        memberAccount.setAmount(amount + deposit);
    }

    // Rút tiền khỏi tài khoản
    public void drawingMoney() {
        System.out.println("Phí rút tiền 2USD/l");
        System.out.println("Nhập số tiền muốn rút khỏi tài khoản: ");
        double fees = 2;
        double drawing = sc.nextDouble();
        double amount = memberAccount.getAmount();
        double total = amount - (drawing + fees);
        if (total >= 0){
            memberAccount.setAmount(amount - (drawing + fees));
        } else if (total < 0){
            System.out.println("Số tiền rút vượt quá số tài khoản");
        }
    }

    // Đáo hạn
    public void extend() {

    }

}
