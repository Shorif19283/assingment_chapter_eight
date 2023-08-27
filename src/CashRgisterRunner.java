

public class CashRgisterRunner {
   // private static CashRegister coo;

    public static void main(String[] args) {
        CashRegister c1=new CashRegister();
       //// CashRegister c2=new CashRegister( 20,Coin.DIME);
        //CashRegister c3=new CashRegister( 10,Coin.NICKEL);

        c1.CashCalculation(5,new Coin(19));
        c1.CashCalculation(5,new Coin(50));
        c1.CashCalculation(5,new Coin(56));


        double totalcash=c1.back();
        System.out.println(totalcash);

         double chage=c1.GiveChange(20);
         System.out.println(chage);

         System.out.println(totalcash);
    }
}
