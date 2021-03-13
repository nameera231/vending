public class VendingMachine {

   Stockpile[] stocks;
   /*	
   * TODO: declare two other instance fields.
   * This vending machine has also a BillBox
   * and a Display.
   */
   BillBox bb;
   Display ds;
   
  
  
  /**
   * TODO: define a three-parameter constructor 
   * that initializes fields.
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
   * TODO: complete a method that returns 
   * an array of Stockpile
   * @return a Stockpile array
   */  
  public Stockpile[] getStockpile( ) {
	  return this.stocks;
  }

  /**
   * TODO: complete a method that returns 
   * a BillBox
   * @return a BillBox
   */  
  public BillBox getBillBox( ) {
	  return this.bb;
  }
  
  /**
   * TODO: complete a method that shows the current 
   * deposited money.
   * @return the deposited money    
   */
  public int showDepositedMoney( ) {
	  return this.bb.getDepositedMoney();
  }

  /**
   * TODO: complete a method that returns a Display.
   * @return a Display    
   */	
  public Display getDisplay( ) {
	   return this.ds;
  }
}
