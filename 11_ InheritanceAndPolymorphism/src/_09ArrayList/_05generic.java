/*
Generic:
    A concept where you can write the a class, interface, or method that is compatible with different data types.
    • instead of writing separate code for different type, you can write one generic code.
    <T> type parameter (Placeholder that gets replaced with a real type)
    <String> type argument (Specifies the types)
*/

class Box<Thing>{
    Thing item;

    public void setItem(Thing item){
        this.item = item;
    }

    public Thing getItem(){
        return this.item;
    }
}
public class _05generic {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Banana");
        
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(2);

        System.out.println(box2.getItem());
    }
}
