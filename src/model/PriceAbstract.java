package model;

public abstract class PriceAbstract implements PriceCode, Cloneable{
	
	double dailyPrice, fixedPrice, fixedDays;
	
	public PriceAbstract(double dailyPrice, double fixedPrice, double fixedDays){
		this.dailyPrice=dailyPrice;
		this.fixedPrice=fixedPrice;
		this.fixedDays=fixedDays;
	}
	
	public double price(int daysRented){
		double result = 0;
		result += fixedPrice;
		if (daysRented > fixedDays) {
			result += (daysRented - fixedDays) * dailyPrice;
		}
		return result;
	}
	
	public PriceCode clone() {
		// TODO Auto-generated method stub
		PriceAbstract res = null;
		try{
			res = (PriceAbstract)super.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return res;
	}	
}
