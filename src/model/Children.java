package model;

public class Children extends PriceAbstract {
	
	private static final double DAILY_PRICE = 1.5;
	private static final double FIXED_PRICE = 1.5;
	private static final double FIXED_DAYS = 3;

	public Children(int daysRented) {
		// TODO Auto-generated method stub
		super(DAILY_PRICE, FIXED_PRICE, FIXED_DAYS);
	}
	
	public double price(int daysRented){
		return super.price(daysRented);
	}

}
