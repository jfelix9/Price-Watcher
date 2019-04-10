package priceWatcher;

//********************************************
//this is will be changed in the future but for
// now is just hard coded

/** represents an item with preset/card-coded fields and variables */
public class item {
	
	String itemName;
	double itemPrice;
	String itemUrl;
	double recentPrice;
	double priceChange;
	
	public item() {
		itemName = "Desk";
		itemPrice = 20;
		itemUrl = "www.amazon.com";
		recentPrice = itemPrice;
		priceChange = itemPrice / recentPrice;
	}

	/** updates class's variables when called */
	public void priceUpdate() {
		recentPrice = itemPrice;
		itemPrice = 20 + (Math.random() * 5);
		priceChange = itemPrice / recentPrice;
	}

	/** gets the price */
	public double getPrice() {
		return itemPrice;
	}

}
