public class _02VoidMethod {
    public static void PrintGrade(double score){
        if(score >= 90.0){
            System.out.println('A');
        }else if(score >= 80.0){
            System.out.println('B');
        }else if(score >= 70.0){
            System.out.println('C');
        }else if(score >= 60.0){
            System.out.println('D');
        }else{
            System.out.println('F');
        }
    }
    public static void main(String[] args) {
        System.out.println("the grade is: ");
        PrintGrade(98.09);

    }
}
