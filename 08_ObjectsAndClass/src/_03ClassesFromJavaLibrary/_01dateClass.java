package _03ClassesFromJavaLibrary;

public class _01dateClass {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        System.out.println("the elapsed time since Jan 1, 1970 is " + date.getTime() + " millisecond");
        System.out.println(date.toString());
    }
}
