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
        circle01.area(4); // output: 6.283185307179586 
    }
}

class circle{
    int radius;

    /*
    area() is Instance method thus non-static, it must be invoked by Object reference Variable.
    however, Math.sqrt is a Static methods defined using static keywords.
        so if we use Math.sqrt(argument) it will work ✔
        but only area(argument), will not work you have to invoke reference variable.
    
    */
    void area(int radius){
        System.out.println(Math.PI * Math.sqrt(radius));
    }
}