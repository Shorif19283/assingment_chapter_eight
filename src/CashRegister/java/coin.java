package CashRegister.java;
 enum coin {
     QUARTER(1),DIME(3),PENNY(4);
     private int value;
      coin(int value)
     {
         this.value=value;
     }
     public int getValue()
     {
         return value;
     }

}
