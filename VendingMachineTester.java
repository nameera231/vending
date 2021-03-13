import java.util.Scanner;

/*tests
 * 
Enter number of different brands: 1
Enter the number of sodas: 1
Enter the price of soda: 1
Enter the ID of brand: 1
Do you want to attemp a purchase? yes
Enter the ID of brand: 1
insert $1 bill...
You've deposited 1 dollar(s) so far.
soda purchase completed successfully.
please collect your drink.
Do you want to attemp a purchase? yes
Enter the ID of brand: 1
your desired soda is no longer available in stockpile. with ID 1
 * 
 * 
 * */
 

public class VendingMachineTester {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of different brands: ");
        int numBrands = sc.nextInt();
        
        /*
         * Stockpiles and a BillBox
         */	
        Stockpile[] stocksAvailable = new Stockpile[numBrands];
        BillBox bills = new BillBox();
		
	    /*
	     * initializing Stockpiles.
	     */
		for(int i = 0; i < numBrands; i++) {
	      System.out.print("Enter the number of sodas: ");
	      int numberOfSoda = sc.nextInt();
	      System.out.print("Enter the price of soda: ");        
	      int priceOfSoda = sc.nextInt();
	      System.out.print("Enter the ID of brand: ");        
	      int sodaID = Integer.parseInt(sc.next());      
	      Stockpile sp = new Stockpile(numberOfSoda, priceOfSoda, sodaID);
	      stocksAvailable[i] = sp;

		}

		/*
		 * a VendingMachine
		 */
		Display d = new Display( );
		BeverageReceiver br = new BeverageReceiver() ;
		VendingMachine vm = new VendingMachine(stocksAvailable,bills,d );

        /*
         * vending machine keeps prompting user 
         * whether she wants to purchase a soda as 
         * long as the user says 'yes' to prompts. 
         */
        while(true) {
          System.out.print("Do you want to attemp a purchase? ");
          String response = sc.next();
          if(response.equals("yes")) {  
           System.out.print("Enter the ID of brand: ");
           int id = Integer.parseInt(sc.next());
           
           /*
            * TODO: Search through Stockpiles and find a
            * Stockpile (sp below) whose ID matches the 
	    * one that user entered above. 
            */
           Stockpile sp = null;
           for (int i =0; i < numBrands; i++)
           {
        	   if (stocksAvailable[i].getID() == id)
        	   {
        		   sp = stocksAvailable[i];
        	   }
        	   
           }
           
           
                                  
           /*
            * user purchases a soda if the Stockpile
            * has not run out of sodas.
            * Display shows whether the soda was
            * purchased successfully.
            */
           if(!sp.isSoldOut()) {
        	int deposit = vm.getBillBox().getDepositedMoney();
        	int price = sp.getPrice();
        	while(deposit != price) {
        	  System.out.println("insert $1 bill...");
        	  /* 
        	   * TODO: insert bill into the BillBox.
        	   * 
        	   * */
        	  bills.insertBill();
        	  //System.out.println(vm.showDepositedMoney());
        	   deposit = vm.showDepositedMoney();
        	   //System.out.println(vm.showDepositedMoney());
	
		  /*
        	   * prints money deposited by user so far.
        	   */
         	  System.out.println("You've deposited " + 
        			 vm.showDepositedMoney( ) + " dollar(s) so far.");
		  /*
		   * Obtain the current deposited money to be compared to price
		   */

        	}
            sp.SodaPurchased();
            System.out.println(vm.getDisplay().showSuccessfulPurchase());
            System.out.println(br.sendPickupMessage());
            vm.getBillBox().updateTotalDepositedBills();        	
           } else {
           	   System.out.println(vm.getDisplay().showSodaSoldOut() + " with ID " + sp.getID());        	   
           }
          } else {
        	  break;
          }
        }
	}
}
