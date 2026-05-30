/*
Arraylist class:
    it is a resizable array provided by the java.util.package. unlike normal arrays, its size can grows or shrinks dynamically as elements are added or removed.
        features of ArrayList:
            • Dynamic size
            • maintains insertion sort
            • Allows duplicate elements
            • Allows null values
            • Provides fast random access using indexes
            • Elements are stored in a resizable array
        
    Syntax:
        ArrayList<DataType> ClassName = new ArrayList<>();
*/

import java.util.ArrayList;

public class _01arrayList{
    public static void main(String[] args) {
        // creating ArrayList Integer
        ArrayList<Integer> arrList = new ArrayList<>();

        //**  adding elements*/
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        System.out.println(arrList); // [1, 2, 3]
        
        //** creating ArrayList String*/
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Karan");
        names.add("Arjun");

        System.out.println(names); // [Rahul, Karan, Arjun]

        //** modifying Elements*/
        names.set(0, "Tesla");
        names.set(1, "Einstein");
        names.set(2, "Newton");

        System.out.println(names); // [Tesla, Einstein, Newton]

        //** accessing elements*/
        System.out.println(names.get(0)); // Tesla

        //** removing elements*/
        names.remove(2);

        System.out.println(names); // [Tesla, Einstein]

        //** size of ArrayList */
        System.out.println(names.size()); // 2

        //** traversing ArrayList */
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        /*
        Tesla
        Einstein
        */

    }
}

