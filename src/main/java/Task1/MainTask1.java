package Task1;

public class MainTask1 {

    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car.Engine engine = new Car.Engine(200);

        System.out.println(car);

        Library library = new Library("Lib name");
        Library.Book book = library.new Book("Title", "Author");

        System.out.println(book.bookLabel());
    }
}
