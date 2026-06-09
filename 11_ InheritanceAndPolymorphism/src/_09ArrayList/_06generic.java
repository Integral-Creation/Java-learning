class Product<T, U>{
    T items;
    U price;

    Product(T items, U price){
        this.items = items;
        this.price = price;
    }

    public T getItems(){
        return this.items;
    }

    public U getPrice(){
        return this.price;
    }
}

public class _06generic {
    public static void main(String[] args) {
        Product<String, Double> product1 = new Product<>("Apple", 100.00);

        System.out.println(product1.getItems());
        System.out.println(product1.getPrice());

        Product<String, Integer> product2 = new Product<>("MovieTicket", 459);

        System.out.println(product2.getItems());
        System.out.println(product2.getPrice());
        

    }
}
