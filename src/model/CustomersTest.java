package model;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CustomersTest {
	private Movie m1, m2, m3;
	private Customers c1, c2;

	@Before
	public void setUp() throws Exception {
		m1 = new Movie(new String("Prizzi's Honor"), Movie.NEW_RELEASE);
		m2 = new Movie(new String("African Queen"), Movie.REGULAR);
		m3 = new Movie(new String("The Man Who Would Be King"), Movie.CHILDRENS);

		c1 = new Customers(new String("Jean-Pierre Machin"));
		c1.addRental(new Rental(m1, 4));
		c1.addRental(new Rental(m2, 1));
		c1.addRental(new Rental(m3, 7));

		c2 = new Customers(new String("Marcel Truc")); // limit test
	}
	

	@Test
	public void testStatement() {
		
		// System.out.println(c2.statement()); //for extracting output string
		String expectedOutput;

		expectedOutput = "Rental Record for Jean-Pierre Machin\n\tPrizzi's Honor\t12.0 \n\t"
				+ "African Queen\t2.0 \n\tThe Man Who Would Be King\t7.5 \n"
				+ "Amount owned is 21.5\nYou earned 4 frequent renter points";
		assertEquals(c1.statement(), expectedOutput);

		expectedOutput = "Rental Record for Marcel Truc\n"
				+ "Amount owned is 0.0\n"
				+ "You earned 0 frequent renter points";
		assertEquals(c2.statement(), expectedOutput);

	}
}