package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Cannon
 */
public class JSONread {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is: " + name);
            
            String location = (String) jsonObject.get("location");
            System.out.println("Location is: " + location);
            
            JSONArray heroesArray = (JSONArray) jsonObject.get("heroes");
            Iterator<String> iterator = heroesArray.iterator();
            
            while(iterator.hasNext())
            {
             System.out.println("Heroes: " + iterator.next());   
        }
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(IOException e) {e.printStackTrace(); }
        catch (Exception e) {e.printStackTrace(); }
        }

}
