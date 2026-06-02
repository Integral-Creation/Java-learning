package _03SuperKeyword;

class PersonGlobal{
    String first;
    String last;

    PersonGlobal(String first, String last){
        this.first = first;
        this.last = last;
    }

    void show(){
        System.out.println("Name: " + first + " " + last);
    }
}

class StudentGlobal extends PersonGlobal{
    double gpa;

    StudentGlobal(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(super.first + "'s gpa: " + gpa);
    }
}

class EmployeeGlobal extends PersonGlobal{
    int salary;

    EmployeeGlobal(String last, String first, int salary){
        super(first, last);

        this.salary = salary;
    }

    void showSalary(){
        System.out.println(super.first + "'s salary is $" + this.salary);
    }
}

public class _04superKeywordCaseStudy {
    public static void main(String[] args) {
        PersonGlobal p = new PersonGlobal("Tesla", "Nikola");

        p.show();

        StudentGlobal s = new StudentGlobal("Einstein", "Albert", 8.9);

        s.show();
        s.showGpa();

        EmployeeGlobal e = new EmployeeGlobal("Newton", "Issac", 12000);

        e.showSalary();
    }
}
