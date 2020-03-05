import java.util.ArrayList;
import java.util.List;

public class FlightScheduling {

	
	
	public static void main(String[] args) {
		
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight(Flight.City.YYZ, "1", "1"));
		flights.add(new Flight(Flight.City.YYC, "1", "2"));
		flights.add(new Flight(Flight.City.YVR, "1", "3"));
		flights.add(new Flight(Flight.City.YYZ, "2", "4"));		
		flights.add(new Flight(Flight.City.YYC, "2", "5"));
		flights.add(new Flight(Flight.City.YVR, "2", "6"));
		
		for (Flight flight : flights)
		{
			flight.printFlightSchedule();
		}
		
		OrderScheduling orderScheduling = new OrderScheduling();
		orderScheduling.readingJSON();		
	}

}
