package _01IntroStringClass;


public class _03stringComparison {
    public static void main(String[] args) {
        /*
        String provides the method for comparing strings, are as follows:
        */


        // • equals(s1: object) : boolean
        String s1 = "Tesla";
        String s2 = "Tesla";
        String s3 = "tesla";
        
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        
        // • equalsIgnoreCase(s1: String) : boolean            
        System.out.println(s1.equalsIgnoreCase(s3)); // true
       
        // • compareTo(s1: String) : int
        String w = "apple";
        String x = "Apple";
        String y = "Banana";
        String z = "Apple";
        System.out.println(x.compareTo(y)); // negative -> 'A' < 'B'
        System.out.println(y.compareTo(x)); // positive -> 'B' > 'A'
        System.out.println(x.compareTo(z)); // 0 -> equals
        
        // • compareToIgnoreCase(s1: String) : int
        System.out.println(x.compareToIgnoreCase(w)); // 0 -> treated as equals
       
       
        // • regionMatches(index: int, s1: String, s1Index: int, len: int) : boolean
        String str1 = "Hello world";
        String str2 = "My world";
        boolean result1 = str1.regionMatches(6, str2, 3, 5); // true
        System.out.println(result1);
       
        // • regionMatches(ignoreCase: boolean,index: int, s1: String, s1Index: int, len: int) : boolean
        String str3 = "MY WORLD";
        boolean result2 = str1.regionMatches(true, 6, str3, 3, 5); // true
        System.out.println(result2);
       
        // • startsWith(prefix: String) : boolean
        String str4 = "NikolaTesla";
        System.out.println(str4.startsWith("Nikola"));
        // • endWith(suffix: String) : boolean
        System.out.println(str4.endsWith("esla"));

    }
}
