import java.util.*;

class GlobalEmployee{
    String name;
    int salary;
    
    GlobalEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    
    void printDetails(){
        System.out.println("Name: " + name + "," + " Salary: " + salary);
    }
}
public class employeeCaseStudy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            
            String name = scanner.next();
            int salary = scanner.nextInt();
            
            GlobalEmployee e = new GlobalEmployee(name, salary);
            
            e.printDetails();
        }
        scanner.close();
    }
}