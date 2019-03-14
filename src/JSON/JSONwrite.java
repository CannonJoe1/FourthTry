package JSON;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSONwrite {
    
    public static void main (String[] args) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("name", "Joe");
        obj.put("location", "Utah");
        
        JSONArray list = new JSONArray();
        list.add("Batman");
        list.add("Iron Man");
        list.add("Thor");
        
        obj.put("heroes", list);
        
        try(FileWriter file = new FileWriter("myJSON.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
        }
        
        System.out.println(obj);
    }
    
}
