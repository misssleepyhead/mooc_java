
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthews = new Account("Matthews account", 1000);
        Account my = new Account("My account", 0);
        matthews.withdrawal(100.0);
        my.deposit(100.0);
        System.out.println(my);
        System.out.println(matthews);

    }
}
