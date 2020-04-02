
public class Flight {
	
	private final String DEPARTURE_CITY = "YUL";
	private String arrivalCity;
	private String day;
	private String flightNumber;
	private  int numberOfOrders;
	
	//enum City {YUL,YYZ,YYC,YVR} ;
	
	public Flight( String arrivalCity, String day, String flightNumber ) 
	{
		super();
		this.arrivalCity = arrivalCity;
		this.day = day;
		this.flightNumber = flightNumber;
		this.numberOfOrders =20;
	}
 	
	public String getDay() 
	{
		return day;
	}
	
	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders --;
	}

	public void setDay( String day ) 
	{
		this.day = day;
	}
	
	public String getArrivalCity() 
	{
		return arrivalCity;
	}
	
	public void setArrivalCity ( String arrivalCity )
	{
		this.arrivalCity = arrivalCity;
	}
	
	public String getFlightNumber() 
	{
		return flightNumber;
	}
	
	public void setFlightNumber( String flightNumber )
	{
		this.flightNumber = flightNumber;
	}
	
	public void printFlightSchedule()
	{
		System.out.println("Flight: " + getFlightNumber() + ", departure: " + DEPARTURE_CITY + ", arrival: " + getArrivalCity() + ", day: " + getDay() + " , order: " + numberOfOrders );
	}
}
