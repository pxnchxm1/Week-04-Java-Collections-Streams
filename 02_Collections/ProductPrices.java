import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductPrices {
    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<>();
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        storeProduct(price, linked, "Milk", 10);
        storeProduct(price, linked, "Pen", 20);
        storeProduct(price, linked, "BournVita", 300);
        storeProduct(price, linked, "Curd", 20); 
        storeProduct(price, linked, "NoteBook", 150);

        TreeMap<String, Integer> tree = new TreeMap<>(price);
        
        List<Map.Entry<String, Integer>> sortedByPrice = new ArrayList<>(price.entrySet());
        sortedByPrice.sort(Map.Entry.comparingByValue());
    
        System.out.println("Sorted by Price:");
        for (Map.Entry<String, Integer> entry : sortedByPrice) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
        System.out.println("Insertion Order (LinkedHashMap): " + linked);
        System.out.println("Final Product Prices (HashMap): " + price);
    }

    
    static void storeProduct(HashMap<String, Integer> priceMap, LinkedHashMap<String, Integer> linkedMap, String name, int cost) {
        priceMap.put(name, cost);
        linkedMap.put(name, cost);
    }
}
