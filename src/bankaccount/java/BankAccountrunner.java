package bankaccount.java;

public class BankAccountrunner {
    public static void main(String[] args) {
        BankAcoount  b=new BankAcoount("shorif","123456789",10000);

        BankAcoount  b1=b.diposit(500);
        System.out.println(b1.getBalace());
        System.out.println(b1.getAccoun());
        System.out.println(b1.getName());

        BankAcoount  b2=b.withdraw(500);
        System.out.println(b2.getBalace());


        System.out.println(b.getBalace());


    }
}
