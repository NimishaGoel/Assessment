import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class OrderScheduling {

	private static void parseOrderObject(JSONObject order, int value) 
    {
		HashMap<String,String> orderMap = new HashMap<String,String>();
			for(int i =1;i<=value;i++)
			{
				JSONObject orderObject = (JSONObject) order.get("order-"+String.format("%03d", i));
				String key = "order-"+String.format("%03d", i);
				String destination = (String) orderObject.get("destination");  
				orderMap.put(key,destination);
			}
    }

	@SuppressWarnings("unchecked")
	public void readingJSON ()
	{
		
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = 
        		new FileReader("C:\\Users\\Nimisha Goel\\workspace\\APP_SOEN6441\\FreightTransportation\\coding-assigment-orders.json"))
        {        	
        	Object obj = jsonParser.parse(reader);
        	System.out.println(obj);
            int countDest= 96; // count 'destination' word in file by split method
    		parseOrderObject((JSONObject)obj, countDest);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        catch (ParseException e) {
            e.printStackTrace();
        }
	}
}
