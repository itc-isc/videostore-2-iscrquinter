

public abstract class Movie
{
	private String title;

	public Movie(String title) {
		this.title 		= title;
		System.out.println("Ricardo Quintero");
	}
		
	public String getTitle () {
		return title;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}