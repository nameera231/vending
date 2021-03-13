public class VendingMachine {

   Stockpile[] stocks;
   /*	
   *
   * This vending machine has also a BillBox
   * and a Display.
   */
   BillBox bb;
   Display ds;
   
  
  
  /**
   * 
   * @param stocks
   * @param bb
   * @param ds
   */
   public VendingMachine(Stockpile[] stocks, BillBox bb, Display ds) {
	   this.stocks = stocks;
	   this.bb = bb;
	   this.ds = ds;
   }
  

  /**
   * a method that returns 
   * an array of Stockpile
   * @return a Stockpile array
   */  
  public Stockpile[] getStockpile( ) {
	  return this.stocks;
  }

  /**
   * a method that returns 
   * a BillBox
   * @return a BillBox
   */  
  public BillBox getBillBox( ) {
	  return this.bb;
  }
  
  /**
   *  a method that shows the current 
   * deposited money.
   * @return the deposited money    
   */
  public int showDepositedMoney( ) {
	  return this.bb.getDepositedMoney();
  }

  /**
   * a method that returns a Display.
   * @return a Display    
   */	
  public Display getDisplay( ) {
	   return this.ds;
  }
}
