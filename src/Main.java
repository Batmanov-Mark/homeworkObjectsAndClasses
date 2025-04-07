public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Йон", "Несбё");
        System.out.println(author1.getFirstName());
        System.out.println(author1.getLastName());

        Author author2 = new Author("Стивен", "Кинг");
        System.out.println(author2.getFirstName());
        System.out.println(author2.getLastName());

        Book book1 = new Book("Охотники за головами", 2008, author1);
        System.out.println("Название книги: " + book1.getName());
        System.out.println("Год публикации: " + book1.getPublicationYear());
        book1.setPublicationYear(2009);
        System.out.println("Год публикации: " + book1.getPublicationYear());
        System.out.println();

        Book book2 = new Book("Оно", 1986, author2);
        System.out.println("Название книги: " + book2.getName());
        System.out.println("Год публикации: " + book2.getPublicationYear());
        System.out.println();

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());



    }
}