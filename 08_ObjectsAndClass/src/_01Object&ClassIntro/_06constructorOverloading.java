class USER{
    String name;
    String email;
    int age;

    USER(){
        this.name = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }
    USER(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    void details(){
        System.out.println("[UserName: " + name + ",Email: " + email + ", Age: " + age + "]");
    }
}

public class _06constructorOverloading {
    public static void main(String[] args) {
        USER user01 = new USER();
        user01.details();
        //[UserName: Guest,Email: Not Provided, Age: 0]
        
        USER user02 = new USER("Tesla" , "inventingThings@gmail.com",24);
        user02.details();
        // [UserName: Tesla,Email: inventingThings@gmail.com, Age: 24]
    }
}
