public class _02accessingObjectsDataAndMethod {
    /*
    After an object is created, its data can be accessed and its methods invoked using dot(.) operator.

        Syntax:
            • objectRefVar.dataField
            •objectRefVar.method(argument)
    */

    public static void main(String[] args) {
        // Reference Variable Creation
        circle circle01 = new circle();

        // Accessing Data
        circle01.radius = 10;

        // Accessing Method
        circle01.area(4); // output: 
    }
}

class circle{
    int radius;

    void area(int radius){
        System.out.println(Math.PI * Math.sqrt(radius)); // output: 6.283185307179586
    }
}