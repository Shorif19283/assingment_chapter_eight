class Coin {
   public static final double PENNY=1.0;
   public static final double NICKEL=10.0;
   public static final double DIME=7.0;
   public static final double QUARTER=25.0;
    public double value;
    public Coin(double value)
    {
        this.value=value;
    }

    public double getValue() {
        return value;
    }
}
