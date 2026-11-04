package BuiderDesignPattern.task01;

public class TravelBooking {
	private String sourceCity;
	private String destinationCity;
	private int noOfPassenger;
	private String travel;
	
	public TravelBooking()
	{
		
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		return "TravelBooking [sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", noOfPassenger="
				+ noOfPassenger + ", travelclass=" + travel + "]";
	}

}
