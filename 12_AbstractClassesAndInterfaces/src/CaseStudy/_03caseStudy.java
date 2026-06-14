import java.util.Scanner;

/*
                           <<abstract>>
                             Staff
          ---------------------------------------
          - name : String
          ---------------------------------------
          + Staff(name : String)
          + grossPay() : int {abstract}
          ---------------------------------------
                    ▲
                    │
        -----------------------------
        │                           │
        │                           │
+---------------------+    +----------------------+
|  PermanentStaff     |    |   ContractStaff      |
+---------------------+    +----------------------+
| - basicPay : int    |    | - hourlyRate : int   |
| - hra : int         |    | - hours : int        |
| - da : int          |    +----------------------+
+---------------------+    | + ContractStaff(...) |
| + PermanentStaff(...)|   | + grossPay() : int   |
| + grossPay() : int  |    | + tax() : int        |
| + tax() : int       |    +----------------------+
+---------------------+
         ▲                          ▲
         │                          │
         └────────── implements ────┘
                    Taxable

                <<interface>>
                   Taxable
            ----------------------
            + tax() : int
            ----------------------
*/

abstract class Staff{
    String name;

    Staff(String name){
        this.name =name;
    }

    abstract int grossPay();
}

interface Taxable{
    int tax();
}

class PermanentStaff extends Staff implements Taxable{
    int basicPay;
    int hra;
    int da;

    PermanentStaff(String name, int basicPay, int hra, int da){
        super(name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
    }

    public int grossPay(){
        return basicPay + hra + da;
    }

    @Override
    public int tax() {
        return (int) (grossPay() * 0.1) ;
    }

}

class ContractStaff extends Staff implements Taxable{
    int hourlyRate;
    int hours;

    ContractStaff(String name, int hourlyRate, int hours){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public int grossPay(){
        return hourlyRate * hours;
    }

    @Override
    public int tax(){
        return (int) (grossPay() * 0.05);
    }

}
public class _03caseStudy {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            String in = scanner.next();
            Staff staff;

            if(in.equals("Permanent")){
                String name = scanner.next();
                int basicPay = scanner.nextInt();
                int hra = scanner.nextInt();
                int da = scanner.nextInt();
                
                staff = new PermanentStaff(name, basicPay, hra, da);
            }else{
                String name = scanner.next();
                int hourlyRate = scanner.nextInt();
                int hours = scanner.nextInt();

                staff = new ContractStaff(name, hourlyRate, hours);
            }

            int grossPay = staff.grossPay();
            int tax = ((Taxable)staff).tax();
            int net = grossPay - tax;

            System.out.println("Type: " + in + ", Name: " + staff.name + ", Gross: " + grossPay + ", Tax: " + tax  + ", Net: " + net);

        }
        scanner.close();
    }
}
