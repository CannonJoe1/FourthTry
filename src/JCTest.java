package fourthtry;
import java.util.Collections;
import java.util.*;

public class JCTest {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>();  //Shows that sets will ignore duplicate
        stringSet.add("Joe");
        stringSet.add("Joe");

        List<String> stringList = new ArrayList<String>(); //Demonstrates that lists will allow duplicates
        stringList.add("Joe");
        stringList.add("Joe");

        Map<String, String> hashMap = new HashMap<String, String>(); //maps the value our car model to our name
        hashMap.put("Joe", "GTI");
        hashMap.put("Kasey", "Hyundai");
        
        
        //Queue -- First in first out. 
    }
    
}
