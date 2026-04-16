package _02WhileLoop;

public class _01WhileLoops {
    public static void main(String[] args) {
        /*
        A while loop execute statements repeatedly while the condition is true

        syntax:
            while(loop-continuation-condition){
                statement;
            }

                            +-----------+
                            |  Start    |
                            +-----------+
                                  |
                                  v
                            +----------------+
               +----------->|   Condition?   |
               |           +----------------+
               |                |           |
               |               Yes          No
               |                |           |
               |                v           v
               |         +--------------+  +------+
               +------- +|  Statements  |  | End  |
                         +--------------+  +------+

            common programming error involving
                infinite loop: loop-continuation-condition should be checked

                ->if code is running in command win so ctrl+c to stop
         */
        int sum = 0, i = 1;
        while(i < 10){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
