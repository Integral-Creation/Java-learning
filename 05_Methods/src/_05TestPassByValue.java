public class _05TestPassByValue {
    public static void swap(int a, int b){
        System.out.println("inside the method");
        System.out.println("before swapping a is: "+a+" and b is: "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a is: "+a+" and b is: "+b);
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println("inside main");
        System.out.println("before swapping a is: "+num1+" and b is: "+num2);

        swap(num1,num2);
        System.out.println("outside the method");
        System.out.println("after swapping a is: "+num1+" and b is: "+num2);


    }
}
