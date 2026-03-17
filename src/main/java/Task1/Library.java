package Task1;

public class Library {

    private String name;

    public Library(String name) {
        this.name = name;
    }

    public class Book{

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String bookLabel(){
            return "Library: " + name + " | Book: Title: " + title + " | Author: " + author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
