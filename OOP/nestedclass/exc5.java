package nestedclass;

class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Ichki (inner) class
    class Book {
        public String getLibraryName() {
            // Tashqi classning o‘zgaruvchisiga murojaat qilmoqda
            return libraryName;
        }
    }
}

public class exc5 {
    public static void main(String[] args) {
        Library library = new Library("Sejong Library");
        Library.Book book = library.new Book(); // Ichki classni chaqirish
        System.out.println("Kutubxona nomi: " + book.getLibraryName());
    }
}
