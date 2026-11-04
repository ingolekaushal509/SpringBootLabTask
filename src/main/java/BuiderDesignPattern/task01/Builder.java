package BuiderDesignPattern.task01;

public class Builder {
	private String sourceCity;
	private String destinationCity;
	private int noOfPassenger;
	private String travel;
	
	public Builder()
	{
		
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public Builder setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
		return this;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public Builder setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
		return this;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public Builder setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
		return this;
	}

	public String getTravel() {
		return travel;
	}

	public Builder setTravel(String travel) {
		this.travel = travel;
		return this;
	}
	
	public TravelBooking booking()
	{
		TravelBooking booking = new TravelBooking();
		booking.setSourceCity(this.sourceCity);
		booking.setDestinationCity(this.destinationCity);
		booking.setNoOfPassenger(this.noOfPassenger);
		booking.setTravel(this.travel);
		return booking;
		
	}

}
