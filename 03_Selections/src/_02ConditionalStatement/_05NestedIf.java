package _02ConditionalStatement;

public class _05NestedIf {
    public static void main(String[] args) {
        /*
        if statement can be inside another if statement to form a nested if.
        if(boolean expression){
            if(boolean expression){
                Statement;
            }
            else{
                Statement;
            }
        }
         */
        int score = 89;
        char grade;

        if(score >= 90){
            grade = 'A';
        }
        else{
            if(score >= 80){
                grade = 'B';
            }
            else{
                if(score >= 70){
                    grade = 'C';
                }
                else{
                    if(score >= 60){
                        grade = 'D';
                    }
                    else{
                        grade = 'F';
                    }
                }
            }
        }

        System.out.println(grade);
    }
}
