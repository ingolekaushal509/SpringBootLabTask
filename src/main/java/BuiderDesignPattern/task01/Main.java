package BuiderDesignPattern.task01;

public class Main {
	public static void main(String[] args) {
		TravelBooking booking = new Builder().setSourceCity("Hyderabad").setDestinationCity("Banglore").setNoOfPassenger(2).setTravel("Bussiness").booking();
		System.out.println(booking);
	}
	
}
