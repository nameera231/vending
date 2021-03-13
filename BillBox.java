public class BillBox {

	/* 
	 * userDepositedBills counts the number of bills
	 * deposited by user. 
	 * totalDepositedBills counts the total number of 
	 * bills deposited by the users of vending machine. 
	 */
	private int userDepositedBills;
	private int totalDepositedBills;
	
    /*
     * The zero-parameter constructor 
     * for initializing fields.
     */
	public BillBox( ) {
       this.userDepositedBills = 0;
       this.totalDepositedBills = 0;
	}
	
	/*
	 *   a method that updates 
	 *  the amount of deposited bills
	 */
    public void insertBill() {
    	this.totalDepositedBills++;
    	this.userDepositedBills++;
    }
		
	/** 
	 *  a method that returns
	 *  the amount of deposited bills.
	 *  @return current deposited bills
	 */
	public int getDepositedMoney( ){
		
		return this.userDepositedBills;
	}

	/* 
	 * Updates the total number of deposited bills
	 * and resets the number of bills deposited by user  
	 */
	public void updateTotalDepositedBills( ) {
	  totalDepositedBills = totalDepositedBills + userDepositedBills;
	  userDepositedBills = 0;
	}
}
