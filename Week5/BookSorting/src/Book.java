public class Book implements Comparable<Book> {
    int ID;
    int publishDate;
    int pageNumber;
    String bookName;
    String authorName;

    public Book(int ID, int publishDate, int pageNumber, String bookName, String authorName) {
        this.ID = ID;
        this.publishDate = publishDate;
        this.pageNumber = pageNumber;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public int compareTo (Book book) {
        return this.getBookName().compareTo(book.getBookName());
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
