package model;

public interface PriceCode {
	
	double price(int daysRented);
	PriceCode clone();
}
