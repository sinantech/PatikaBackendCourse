import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> set = new TreeSet<>();
        set.add(new Book(1, 1936, 136, "In The Mountains of Madness", "H.P. Lovecraft"));
        set.add(new Book(2, 1920, 37, "The Cats of Ulthar", "H.P. Lovecraft"));
        set.add(new Book(3, 1928, 160, "The Call of Cthulhu", "H.P. Lovecraft"));
        set.add(new Book(4, 1925, 67, "The Temple", "H.P. Lovecraft"));
        set.add(new Book(5, 1937, 136, "Shadow Over Inssmouth", "H.P. Lovecraft"));

        for (Book book : set) {
            System.out.println(book.getID() + "==" + book.getPublishDate() + "==" + book.getPageNumber() + "==" +
                    book.getBookName() + "==" + book.getAuthorName());
        }
        System.out.println("-------------------------------------------------");

        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishDate() - o2.getPublishDate();
            }
        });

        set2.add(new Book(1, 1936, 136, "In The Mountains of Madness", "H.P. Lovecraft"));
        set2.add(new Book(2, 1920, 37, "The Cats of Ulthar", "H.P. Lovecraft"));
        set2.add(new Book(3, 1928, 160, "The Call of Cthulhu", "H.P. Lovecraft"));
        set2.add(new Book(4, 1925, 67, "The Temple", "H.P. Lovecraft"));
        set2.add(new Book(5, 1937, 136, "Shadow Over Inssmouth", "H.P. Lovecraft"));

        for (Book book : set2) {
            System.out.println(book.getID() + "==" + book.getPublishDate() + "==" + book.getPageNumber() + "==" +
                    book.getBookName() + "==" + book.getAuthorName());
        }

    }

}