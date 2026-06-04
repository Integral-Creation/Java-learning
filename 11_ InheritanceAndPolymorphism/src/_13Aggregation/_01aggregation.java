package _13Aggregation;
/*
Aggregation:
    Represents a "has-a" relationship between Objects.
    One Objects contains another objects as part of its structure, but the contained objects can exists independently.
*/

class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title  = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " " + "(" + this.pages + "  pages)";
    }
}

class Library{
    String name;
    int year;

    Book[] books;

    Library(String name, int year , Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void display(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available");

        for(Book i: books){
            System.out.println(i.displayInfo());
        }
    }
}
public class _01aggregation {
    public static void main(String[] args) {
        Book book1 = new Book("The Philosopher's Stone",223);
        Book book2 = new Book( "The Chamber of Secrets",251);
        Book book3 = new Book( "The Prisoner of Azkaban",317);
        Book book4 = new Book( "The Goblet of Fire",636 );
        Book book5 = new Book( "The Order of the Phoenix",766);
        Book book6 = new Book( "The Half-Blood Prince",607);
        Book book7 = new Book( "The Deathly Hallows",607 );

        Book[] books = {book1, book2, book3, book4, book5, book6, book7};

        Library lib = new Library("National Library of India", 1890, books);

        lib.display();

    }
}
