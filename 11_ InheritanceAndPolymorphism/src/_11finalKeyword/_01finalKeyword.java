package _11finalKeyword;
/*
final keyword:
    It is used to restrict the modification of variable, methods, class.
*/

class Test{
    final int x = 10;

    void display(){
        // x = 20; // error
        System.out.println("value: " + x);
    }
}
public class _01finalKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
