package _04StaticVariableConstantsMethods;

/*
    Instance method:
        it can invoke an instance or static method and access an instance or static data field.
    
        Static method:
        it can invoke a static method or access an instance data field. However a static method cannot
        invoke an instance method or access an instance data field.

                         |------>invoke instance method                            |------>invoke instance method
                         |------>access instance data field                        |------>access instance data field
    instance method -----|                                      static method -----|
                         |------>invoke static method                              |------>invoke static method
                         |------>access static data field                          |------>access static data field
*/

/* example code */
public class _02instanceMethodAndStaticMetod {
    int i = 5;
    static int k = 2;

    /* Instance method */
    void method1(){
/*
    • can access i (instance variable) and k (static variable)
    • can call static method freely
*/
        i = i + k +method2(i , k);
    }

    /* Static method */
    static int method2(int i, int j){
/*
    • cannot access instance variable
*/
        return (int) (Math.pow(i, j));
    }

    public static void main(String[] args) {
        // int j = i; // It is wrong because i is an instance variable.
        /* Correct code */
        _02instanceMethodAndStaticMetod a = new _02instanceMethodAndStaticMetod();

        int j = a.i; // a.i can access the object's instance variable.
        System.out.println(j);


        // method1(); // It is also wrong because method1 is an instance variable.
        /* Correct code */
        a.method1(); // call instance method via object

    }
}
