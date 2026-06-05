import java.util.ArrayList;
import java.util.Collections;

public class _03caseStudy {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();

        arr.add(3.14);
        arr.add(2.41);
        arr.add(5.78);

        ArrayList<String> strArr = new ArrayList<>();

        strArr.add("Apple");
        strArr.add("Banana");
        strArr.add("Orange");

        System.out.println(strArr); // [Apple, Banana, Orange]

        strArr.remove(1);
        System.out.println(strArr); // [Apple, Orange]

        strArr.set(1, "Mango");
        System.out.println(strArr); // [Apple, Mango]

        System.out.println(strArr.size()); // 2 

        Collections.sort(strArr);
        System.out.println(strArr); // [Apple, Mango]


        for(String i: strArr){
            System.out.println(i);
        }
    }    
}
