public class Stockpile {
	
	private int numSodas;
	
    /* TODO: declare two other instance fields.
     * One field stores price and the other
     * stores ID of soda.
     */
	private int sodaPrice;
	private int sodaID;

	/**
	 * TODO: define a three-parameter constructor that initializes fields
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
	 *  TODO: complete a method that indicates whether stockpile runs out of soda
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
	 * TODO: complete a method that provides the price of soda
	 * @return the price of soda
	 */
	public int getPrice() {
		return this.sodaPrice;
		
	}
	
	/**
	 * TODO: complete a method that provides the ID of soda
	 * @return the ID of soda
	 */
	public int getID() {
		return this.sodaID;
	}	
}
