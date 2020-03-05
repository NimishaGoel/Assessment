
public class Flight {
	
	private final City DEPARTURE_CITY = City.YUL;
	private City arrivalCity;
	private String day;
	private String flightNumber;
	private static final int numberOfOrders = 20;
	
	enum City {YUL,YYZ,YYC,YVR} ;
	
	public Flight( City arrivalCity, String day, String flightNumber ) 
	{
		super();
		this.arrivalCity = arrivalCity;
		this.day = day;
		this.flightNumber = flightNumber;
	}
 	
	public String getDay() 
	{
		return day;
	}
	
	public void setDay( String day ) 
	{
		this.day = day;
	}
	
	public City getArrivalCity() 
	{
		return arrivalCity;
	}
	
	public void setArrivalCity ( City arrivalCity )
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
		System.out.println("Flight: " + getFlightNumber() + ", departure: " + DEPARTURE_CITY + ", arrival: " + getArrivalCity() + ", day: " + getDay());
	}
}
