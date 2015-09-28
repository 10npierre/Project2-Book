/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String rNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    public void printAuthor()
    {
        System.out.println("Author of the book is: " +author);
    }
    
    public void printTitle()
    {
        System.out.println("Title of the book is: " +title);
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printDetails()
    {
        System.out.println("Author of book: " +author);
        System.out.println("Title of book: " +title);
        System.out.println("Number of pages: " +pages);
    }
}
