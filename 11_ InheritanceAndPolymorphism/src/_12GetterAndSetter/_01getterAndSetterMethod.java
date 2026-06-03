package _12GetterAndSetter;

/*
GETTER AND SETTER
    they help protect the objects data and add rules for accessing or modifying
        • GETTER = methods that make a fields READABLE
        • SETTER = methods that make a fields WRITEABLE
*/

class UNIVERSALcar{
    private String model;
    private String color;
    private int price;

    UNIVERSALcar(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }else
            this.price = price;
    }


}
public class _01getterAndSetterMethod {
    public static void main(String[] args) {
        UNIVERSALcar car = new UNIVERSALcar("Tesla", "Grey", 100000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
        
        car.setColor("Yellow");
        car.setPrice(120000);
        
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
