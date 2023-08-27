package bankaccount.java;

public class BankAcoount {
    public  final String name;
    public  final  String accoun;
    public  double balace;

    public BankAcoount(String name,String accoun,double balace)
    {
        this.name=name;
        this.accoun=accoun;
        this.balace=balace;
    }
    public String getName()
    {
       return name;
    }
    public String getAccoun()
    {
        return accoun;
    }
    public double getBalace()
    {
        return balace;
    }

    public BankAcoount diposit(double amount)
    {
        balace+=amount;
        return new BankAcoount("name","accoun",balace);
    }

    public BankAcoount withdraw(double amoutnt)
    {
        balace-=amoutnt;
        return new BankAcoount("shorie","123456789",balace);
    }
}
