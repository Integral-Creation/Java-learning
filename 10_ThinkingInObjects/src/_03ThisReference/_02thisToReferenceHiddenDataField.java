package _03ThisReference;

/*
this keyword can be used to reference hidden data fields 
*/

class F{
    private int i = 5;
    private static double k = 0;

    public void setI(int i){
        this.i = i;
    }

    public static void setK(int k){
        /*
        A hidden static variable can be accessed using the ClassName.staticVariable reference
        */
        F.k = k;
    }

    void display(){
        System.out.println("i: " + i);
        System.out.println("k: " + k);
    }
}
public class _02thisToReferenceHiddenDataField {
    public static void main(String[] args) {
        F f01 = new F();

        f01.setI(6);
        F.setK(4);

        f01.display();
    }
}
