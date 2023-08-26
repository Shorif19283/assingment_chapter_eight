package CashRegister.java;

public class cashregister {
    public int cash;
    public cashregister()
    {
        cash=0;
    }
    public void calculation(int count,coin cointYpe)
    {
        int val=cointYpe.getValue();
        cash+=count*val;
    }

    public int givevlaue(int collectvalue)
    {
        if(collectvalue<=cash)
        {
            cash=cash-collectvalue;
        }
        return cash;
    }
    public int getCash()
    {
        return cash;
    }
}
