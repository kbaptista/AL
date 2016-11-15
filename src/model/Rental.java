package model;

public class Rental {
	private Movie _movie;
	private PriceCode _priceCode;
	private int _daysRented;

	public Rental(Movie movie, int daysRented)
	{
		_movie=movie;
		_daysRented=daysRented;
		_priceCode=movie.getPriceCode().clone();
	}
	public int getDaysRented()
	{
		return _daysRented; 
	}
	public Movie getMovie()
	{
		return _movie;
	}
	public PriceCode getPriceCode()
	{
		return _priceCode;
	}
}
