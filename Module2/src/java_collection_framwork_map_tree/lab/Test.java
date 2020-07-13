package java_collection_framwork_map_tree.lab;
import java.util.HashMap;
import java.util.Set;
public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John12", 30);
        customers.put("Mike", 28);
        customers.put("Bil", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
