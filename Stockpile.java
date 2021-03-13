public class Stockpile {
	
	private int numSodas;
	
    /* 
     * One field stores price and the other
     * stores ID of soda.
     */
	private int sodaPrice;
	private int sodaID;

	/**
	 * 
	 * @param numSodas number of sodas
	 * @param sodaPrice price of soda
	 * @param sodaID ID of soda
	 */
	public Stockpile(int numSodas, int sodaPrice, int sodaID){
		this.numSodas= numSodas;
		this.sodaPrice = sodaPrice;
		this.sodaID = sodaID;
	}

	
	/*
	 *  TODO: complete a method that updates the number of
	 *  sodas after a purchase
	 */
	public void SodaPurchased() {
		this.numSodas--;		
	}

	/** 
	 *  a method that indicates whether stockpile runs out of soda
	 *  @return true if stockpile runs out of soda
	 */
	public boolean isSoldOut() {
		if(this.numSodas == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * a method that provides the price of soda
	 * @return the price of soda
	 */
	public int getPrice() {
		return this.sodaPrice;
		
	}
	
	/**
	 *  a method that provides the ID of soda
	 * @return the ID of soda
	 */
	public int getID() {
		return this.sodaID;
	}	
}
