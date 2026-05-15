package generics;

public class Main {
    public static void main(String[] args) {
        // LAPTOP GENERICS
        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("ASUS");
        laptopBag.setContent(laptop);

        // BOOK GENERICS
        Bag<Book> booBag = new Bag<>();
        Book book = new Book();
        book.setName("Clean Code Architecture");
        booBag.setContent(book);
    }
}