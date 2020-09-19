package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Yonas","Habtu");
        account1.setAccountHolder( account1.firstName+" "+account1.lastName );
        account1.setAccountNumber(12345678);
        account1.setAccountBalance(50);

        account1.availableBalance();
        account1.deposit(500);
        account1.availableBalance();

        account1.withDraw(700);

        account1.withDraw(-200);
        account1.withDraw(0);

        account1.withDraw(300);
        account1.availableBalance();
        account1.deposit(1000000);
        System.out.println(account1);

    }
}
