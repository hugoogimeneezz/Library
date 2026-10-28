public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book book = new Book("Under the water", anAuthor, 30.4, 3);
        System.out.println(book);
        System.out.println(book.getPrice());
        System.out.println(book.getQtyInStock());
        Book anotherBook = new Book("Java for dummy",
                new Author("Cafazzo", "caffazzo3@gmail.com", 'm'), 29.95, 888);

        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());

        Book[] books = new Book[5];
        books[0] = book;
        books[1] = anotherBook;
        books[2] = new Book("David y su carcel",
                new Author("David Iaser", "iaserubuntu@gmail.com", 'm'), 27.50, 4);
        books[3] = new Book("Nico nopijana",
                new Author("Nicorov", "nicolas@poraquinovengamas.com", 'f'), 21.3, 5);
        books[4] = new Book("Fabiolo cabolo",
                new Author("Don nicochapax", "nicocaffazo@nopijana.com", 'f'), 19.6, 5);

        for (int i = 0;i< books.length; i++) {
            System.out.println(books[i]);
        }

    }
}
