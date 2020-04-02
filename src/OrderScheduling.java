import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class OrderScheduling {

	@SuppressWarnings("unchecked")
	public Set<Entry<String,String>> readingJSON ()
	{
		
		JSONParser jsonParser = new JSONParser();
		HashMap<String,String> orderMapping = new HashMap();
        
        try 
        {        	
        	Object orders = jsonParser.parse(new FileReader("C:\\Users\\Nimisha Goel\\workspace\\APP_SOEN6441\\FreightTransportation\\coding-assigment-orders.json"));
        	JSONObject orderObject = (JSONObject) orders;
        	System.out.println(orderObject);
        	for(Object order: orderObject.keySet())
        	{
        		JSONObject destination = (JSONObject)orderObject.get(order);
        		String key =order.toString();
        		
        		String value =destination.get("destination").toString();
        		
        		orderMapping.put(key, value);
        	}
        	TreeMap<String,String> sortOrders = new TreeMap<>(orderMapping);
        	Set<Entry<String,String>> entries = sortOrders.entrySet();
        	for(Entry<String,String> sort : entries)
        	{
        		System.out.println(sort.getKey() + "    " + sort.getValue());
        	}
        	 return entries;
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
        return null;
	}
}
