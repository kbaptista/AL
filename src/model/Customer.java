package model;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Customer {
	private String _name;
	private List<Rental> _rentals = new ArrayList<Rental>();
	public Customer(String name)
	{
		_name=name;
	}
	public void addRental(Rental rental)
	{
		_rentals.add(rental);
	}
	public String getName()
	{
		return _name;
	}
	public String statement()
	{
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals=_rentals.();
		String result = "Rental Record for "+getName()+"\n";
		while (rentals.hasMoreElements())
		{
			double thisAmount=0;
			Rental each=(Rental) rentals.nextElement();
			thisAmount+=each.getMovie().getPriceCode().price(each.getDaysRented());
			frequentRenterPoints++;
			if( (each.getMovie().getPriceCode().equals(new NewRelease(0))) && (each.getDaysRented()>1)) 
				frequentRenterPoints++;
			result +="\t" + each.getMovie().getTitle()+"\t"+
					String.valueOf(thisAmount) +" \n";
			totalAmount+=thisAmount;
		}
		result += "Amount owned is " + String.valueOf(totalAmount) +
				"\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) +
				" frequent renter points";
		
		BuilderHTML buildHTML = new BuilderHTML();
		buildHTML.buildName(_name);
		for (Rental each : _rentals) {
			buildHTML.buildRental(each);
		}
		buildHTML.buildAmount();
		buildHTML.buildPoints();
		
		return buildHTML.getResult();

	}
}
