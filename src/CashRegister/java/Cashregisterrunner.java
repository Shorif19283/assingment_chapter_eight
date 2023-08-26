package CashRegister.java;

public class Cashregisterrunner {
    public static void main(String[] args) {
        cashregister c=new cashregister();

        c.calculation(5,coin.DIME);
        c.calculation(5,coin.QUARTER);
        c.calculation(5,coin.PENNY);

        int ans= c.getCash();
        System.out.println(ans);

        int decrise= c.givevlaue(3);
        System.out.println(decrise);

        System.out.println(c.getCash());
    }
}
