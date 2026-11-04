package BuiderDesignPattern;

public class Movie {
	
	private String movieName;
	private String ReleasedDate;
	
	public Movie() {
		
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleasedDate() {
		return ReleasedDate;
	}

	public void setReleasedDate(String releasedDate) {
		ReleasedDate = releasedDate;
	}
	
	public String toString()
	{
		return "MovieName: "+movieName+"ReleasedDate: "+ReleasedDate;
	}
}
class Builder
{
	private String movieName;
	private String ReleasedDate;
	
	public Builder() {
		
	}

	public String getMovieName() {
		return movieName;
	}

	public Builder setMovieName(String movieName) {
		this.movieName = movieName;
		return this;
	}

	public String getReleasedDate() {
		return ReleasedDate;
	}

	public Builder setReleasedDate(String releasedDate) {
		 ReleasedDate = releasedDate;
		 return this;
	}
	
	
	public Movie build() 
	{
		Movie movie = new Movie();
		movie.setMovieName(this.movieName);
		movie.setReleasedDate(this.ReleasedDate);
		return movie;
	}
}

