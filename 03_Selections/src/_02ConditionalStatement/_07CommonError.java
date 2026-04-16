package _02ConditionalStatement;

public class _07CommonError {
    public static void main(String[] args) {
        /*
        common error in Selection statements
        error 1:
            missing '{' braces
        error 2:
            wrong semicolon ';'
                if(radius);  //logic error
                if(radius){ empty block }  //logic error:(
        error 3: reductant testing of boolean value
            to test boolean variable is true or false in a condition,
            it is reductant to use the equality operator like the code

                boolean even = true;
                if(even == true){ // reductant
                    System.out.print("is even");
                }
                    ||
                    v
                if(even){
                    System.out.print("is even");
                }
        error 4: Dangling else Ambiguity
            consider this example->
                            int i = 1, j = 2, k = 3;
                            if(i > j)
                                if(i > k)
                                    System.out.print("A");
                            else
                                System.out.print("B");

            above is two if-clause and one else clause, so which if-clause
            is matched with the else clause?
            the indentation indicates the else clause matches the first if-clause.
            however the else clause actually matches the second if-clause. This situation is known as
            "Dangling if ambiguity"
            --->to force else to match first use braces '{'

            pro tips:
                if(num % 2 == 0)
                    even = true;
                else
                    even = false;

                    ||
                    v
                boolean even
                    = num % 2 == 0;
         */

        int num = 5;
        boolean even = (num % 2) == 0;
        System.out.println(even);
    }
}
