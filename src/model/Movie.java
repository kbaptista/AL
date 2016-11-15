package model;

public class Movie {
	
	public static final PriceCode CHILDRENS = new Children(0);
    public static final PriceCode REGULAR = new Regular(0);
    public static final PriceCode NEW_RELEASE = new NewRelease(0);

	private String _title;
	private PriceCode _priceCode;

	public Movie(String title,PriceCode priceCode)
	{
		_title=title;
		_priceCode=priceCode;
	}
	public PriceCode getPriceCode()
	{
		return _priceCode;
	}
	public void setPriceCode(PriceCode priceCode)
	{
		_priceCode=priceCode;
	}
	public String getTitle()
	{
		return _title;
	}
}