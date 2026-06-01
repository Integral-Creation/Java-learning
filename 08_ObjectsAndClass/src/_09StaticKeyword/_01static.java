package _09StaticKeyword;

class Friend{
    static int numOfFriends;
    String name;

    Friend(String name){
        numOfFriends++;
        this.name = name;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " Friends.");
    }
}

public class _01static {
    public static void main(String[] args) {
        Friend friend01 = new Friend("Naruto");
        System.out.println(friend01.name);

        Friend friend02 = new Friend("Lee");
        System.out.println(friend02.name);
        
        Friend friend03 = new Friend("Jiraya");
        Friend friend04 = new Friend("Amiya");
        System.out.println(friend03.name);
        System.out.println(friend04.name);
        
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }    
}
