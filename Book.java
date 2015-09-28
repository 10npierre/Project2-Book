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
    private int yearPublished;
    private String condition;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int published, String bookCondition)
    {
        author = bookAuthor;
        title = bookTitle;
        yearPublished = published;
        condition = bookCondition;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYearPublished()
    {
        return yearPublished;
    }
    
    public String getBookCondtion()
    {
        return condition;
    }
    
    public void PrintDetails()
    {
        System.out.println("The title of the book is: " +title);
        System.out.println("The author of the book is: " +author);
        System.out.println("Year it was published: " +yearPublished);
        System.out.println("Condition of book: " +condition);
    }
}
