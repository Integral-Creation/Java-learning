package _09Excercises;

import java.util.Scanner;

/*
(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here is

a sample run:
4
40 55 70 58
Enter the number of students: 
Enter 4 scores: 
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
*/
public class _01program {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        System.out.print("Enter "+ n + " score: ");
        int[] marks = new int[n];

        int best = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            marks[i] = scanner.nextInt();
            if(marks[i] >= best){
                best = marks[i];
            }
        }

        for(int i = 0 ; i < n; i++){
            if(marks[i] >= (best - 10)){
                System.out.println("Student"+ i+" score is "+marks[i]+" and grade is A");
            }else if(marks[i] >= (best - 20)){
                System.out.println("Student"+ i+" score is "+marks[i]+" and grade is B");
            }else if(marks[i] >= (best - 30)){
                System.out.println("Student"+ i+" score is "+marks[i]+" and grade is C");
            }else if(marks[i] >= (best - 40)){
                System.out.println("Student"+ i+" score is "+marks[i]+" and grade is D");
            }else{
                System.out.println("Student"+ i+" score is "+marks[i]+" and grade is F");
            }
        }
        scanner.close();
    }
}
