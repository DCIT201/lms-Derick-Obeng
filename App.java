public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        library.addBook(book1);
        library.addBook(book2);

        Patron patron = new Patron("John Doe", "P001");

        System.out.println("Lending book 1984: " + library.lendBook("1234567890"));
        System.out.println("Lending book 1984 again: " + library.lendBook("1234567890"));
        library.returnBook("1234567890");
        System.out.println("Lending book 1984 after return: " + library.lendBook("1234567890"));
    }
}
