public class Main {
    public static void main(String[] args) {

        Author author = new Author("Йон", "Несбё");
        System.out.println(author.getFirstName());
        System.out.println(author.getLastName());

        Book book = new Book("Охотники за головами", 2008, author);
        System.out.println("Название книги: " + book.getName());
        System.out.println("Год публикации: " + book.getPublicationYear());

        book.setPublicationYear(2009);

        System.out.println("Год публикации: " + book.getPublicationYear());

    }
}