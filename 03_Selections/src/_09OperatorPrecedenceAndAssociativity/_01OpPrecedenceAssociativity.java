package _09OperatorPrecedenceAndAssociativity;

public class _01OpPrecedenceAssociativity {
    public static void main(String[] args) {
        //page - 115
        /*
      precedence
          |    var++ and Var-- (post fix)
          |    +,- (unary plus and minus), ++var and --var (prefix)
          |    type-casting
          |    !(not)
          |    *,/,%
          |    +,- (binary add and subtraction)
          |    <,<=,>,>= (comparison)
          |    ==, != (equality)
          |    ^ exclusive or
          |    && (AND)
          |    || (OR)
          |    =,+=,-=,*=,/=,%= (assignment operator)
          v

          if the operator with the same precedence are next to each other their associativity determine the order of
          evaluation
          example:
          +,- have same precedence
            a - b + c - d ========== (((a - b) + c ) - d)

            assignment operator has right precedence
                a = b += c = 5 ============ (a = (b += (c = 5)))
         */
        int a = 1, b = 2, c = 3;

        a = b += c = 5;
        System.out.println(a); // 7
        System.out.println(b); // 7
        System.out.println(c); // 5

        boolean result  = (false || (true && false)); // precedence order is marked according to parenthesis
        System.out.println(result); // false

        boolean result2 = ((true ^ false) || false);
        System.out.println(result2); //  true

        boolean result3 = ((((1 * 3) - 4) > 2) && (6 - 7) > 4);
        /*
        ((((1 * 3) - 4) > 2) && (6 - 7) > 4)
        ((((3) - 4) > 2) && (6 - 7) > 4)
        ((((-1) > 2) && (6 - 7) > 4)
        ((false) && (6 - 7) > 4)
        ((false) && (-1) > 4)
        ((false) && (-1) > 4)
        ((false) && (false))
        (false)
         */
        System.out.println(result3);
    }
}
