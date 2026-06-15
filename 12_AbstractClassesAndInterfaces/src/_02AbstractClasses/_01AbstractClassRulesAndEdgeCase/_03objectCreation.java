package _02AbstractClasses._01AbstractClassRulesAndEdgeCase;

/* • Objects cannot be created from an abstract class */

abstract class UniversalVehicle {

}
public class _03objectCreation {
    public static void main(String[] args) {
        // UniversalVehicle v = new UniversalVehicle(); 
        /** Cannot instantiate the type UniversalVehicle
         * Because an abstract class is incomplete and meant to be inherited
         */
    }
}
