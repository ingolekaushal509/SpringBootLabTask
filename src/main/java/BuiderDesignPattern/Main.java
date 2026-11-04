package BuiderDesignPattern;

public class Main {
	public static void main(String[] args) {
		
			Movie movie = new Builder().setMovieName("Ramayana").setReleasedDate("05/nov/2026").build();
			System.out.println(movie);
		
	}
}
