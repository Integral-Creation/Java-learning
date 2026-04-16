package _05LogicalOperator;

public class _01LogicalOp {
    public static void main(String[] args) {
        /*
        the logical operator are:
            ! (logical-NOT) logical negation
            && (logical- AND) logical conjunction
            || (logical-OR) logical disjunction
            ^ (exclusive OR) logical exclusion

            Truth table for operator !
               (p) (p!)
                1   0
                0   1

            Truth table for operator &&
                p1  p2  (p1 && p2)
                0   0       0
                0   1       0
                1   0       0
                1   1       1

            Truth table for operator ||
                p1  p2  (p1 || p2)
                0   0       0
                0   1       1
                1   0       1
                1   1       1

            Truth table for operator ^
                p1  p2  (p1 ^ p2)
                0   0       0
                0   1       1
                1   0       1
                1   1       0

         */


        // example of !
        int value = 2;
        if(!((value % 2) == 0)){
            System.out.println("odd");
        }

        // example of &&
        int age = 18;
        boolean hasVoterId = true;
        if((age >= 18) && hasVoterId){
            System.out.println("eligible for vote");
        }

        // example of ||
        int personAge = 34;
        char gender = 'F';

        if((personAge > 34) || gender == 'F'){
            System.out.println("true");
        }

        // example of ^
        if((age > 34) ^ gender == 'F'){
            System.out.println("Exactly one condition is true (either age > 34 OR gender is F, but not both).");
        } else {
            System.out.println("Either both conditions are true or both are false.");
        }
    }
}
