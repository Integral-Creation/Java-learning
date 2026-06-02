/*
Access Modifier:
    Access modifiers in java are used to control the visibility and access of class, method, and variable.
    They enforce encapsulation by restricting access to different parts of the program.

    Java provides the four types of access modifiers:
        • public -> it is accessible everywhere
        • private ->  it is accessible within the same class
        • protected -> it is accessible within the same package
        • default -> it is accessible within the same package
*/

class GlobalPerson{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class _01intro{
    public static void main(String[] args) {
        GlobalPerson p = new GlobalPerson();
        p.setName("Luffy");
        System.out.println(p.getName());
    }
}

