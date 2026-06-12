package CaseStudy;

class InvalidAgeException extends Exception{
    // parameterized constructor
    InvalidAgeException(String message){
        super(message);
    }
}

public class customException {
    public static void checkAge() throws InvalidAgeException {
        int age = 10;
        if(age < 18){
            throw new InvalidAgeException("Age is too low");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge();
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        String str = "Hello world good night";

        String[] arr = str.split(" ");

        for(String i: arr){
            System.out.println(i);
        }
    }
}
