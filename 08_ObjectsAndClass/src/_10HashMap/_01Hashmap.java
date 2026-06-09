package _10HashMap;

import java.util.HashMap;

/*
HashMap:
    A data structure that stores key-Value pairs
    Keys are unique, But values can be duplicated
    Does not maintain any order, but is memory efficient
    
    Import:
        • import java.util.HashMap;

    syntax:
        • HashMap<KeyType, ValueType> mapName = new Hashmap<>();
*/
public class _01Hashmap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
    
    // Common method
        /**put() */
        map.put("Java-Book", 500.00);
        map.put("Book", 25.00);
        map.put("Pen", 10.00);
        map.put("Notebook", 15.00);

        System.out.println(map); // {Notebook=15.0, Book=25.0, Pen=10.0, Java-Book=500.0}

        /**remove()  */
        map.remove("Pen");

        System.out.println(map); // {Notebook=15.0, Book=25.0, Java-Book=500.0}

        /**get() */
        System.out.println(map.get("Notebook")); // 15.0

        /**containsKey() */
        System.out.println(map.containsKey("Pen")); // false

        /**containsValue */
        System.out.println(map.containsValue(15.00)); // true

        /**size() */
        System.out.println(map.size()); // 3

        //for each
        for(String key : map.keySet() ){
            System.out.println(key + " : Rs." + map.get(key) );
        }
        /*
            Notebook : Rs.15.0
            Book : Rs.25.0
            Java-Book : Rs.500.0        
        */

        /**clear() */
        map.clear(); 
        System.out.println(map.size()); // 0
    }
    
}
