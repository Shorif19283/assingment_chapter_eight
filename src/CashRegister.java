class CashRegister {
    public double cash;
   public CashRegister()
    {
        cash=0;
    }

    public  void CashCalculation(double count,Coin coinType)
    {
        double cash_value= coinType.getValue();
        cash+=cash_value*count;
        //return cash;
    }
    public double GiveChange(double cashmany)
    {
        if(cashmany<=cash) {
           // return (cash - cashmany);
            cashmany=cash-cashmany;
            return cashmany;
        }
        return 0;
    }

    public double back()
    {
        return cash;
    }

}
