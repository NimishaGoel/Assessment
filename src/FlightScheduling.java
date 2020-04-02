import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class FlightScheduling {

	static int index_availFlight (List<Flight> flights, String destination)
	{
		for( Flight flight: flights)
		{
			String arrival = flight.getArrivalCity();
			if(arrival.equals(destination) && flight.getNumberOfOrders() > 0 )
			{
				flight.setNumberOfOrders(flight.getNumberOfOrders());
				return Integer.parseInt(flight.getFlightNumber());
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		List<Flight> flights = new ArrayList<>();
		flights.add(new Flight("YYZ", "1", "1"));
		flights.add(new Flight("YYC", "1", "2"));
		flights.add(new Flight("YVR", "1", "3"));
		flights.add(new Flight("YYZ", "2", "4"));		
		flights.add(new Flight("YYC", "2", "5"));
		flights.add(new Flight("YVR", "2", "6"));
		
		for (Flight flight : flights)
		{
			flight.printFlightSchedule();
		}
		
		OrderScheduling orderScheduling = new OrderScheduling();
		Set<Entry<String,String>> output = orderScheduling.readingJSON();
		
		for(Entry<String,String> sort : output)
		{
			int val =index_availFlight(flights , sort.getValue());
		
			System.out.println(sort.getKey());
			if(val != -1 )
			{
				
				flights.get(val-1).printFlightSchedule();
			}
			else{
				System.out.println("Flight Number is unscheduled");
			}
			
		}
	}

}
