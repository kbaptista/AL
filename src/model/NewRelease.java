package model;

public class NewRelease extends PriceAbstract {
	private static final double DAILY_PRICE = 3;
	private static final double FIXED_PRICE = 0;
	private static final double FIXED_DAYS = 0;
	
	public NewRelease(int daysRented) {
		// TODO Auto-generated method stub
		super(DAILY_PRICE, FIXED_PRICE, FIXED_DAYS);
	}
	
	public double price(int daysRented){
		return super.price(daysRented);
	}
}
