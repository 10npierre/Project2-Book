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
    private int price;
    private String genre;
    private int id;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int published, String bookCondition, int bookPrice, String bookGenre, int bookID)
    {
        author = bookAuthor;
        title = bookTitle;
        yearPublished = published;
        condition = bookCondition;
        price = bookPrice;
        genre = bookGenre;
        id = bookID;
    }

    // Add the methods here ...
    public void setBookTitle(String BTitle)
    {
        title = BTitle;
    }
    
    public void setBookAuthor(String BAuthor)
    {
        author = BAuthor;
    }
    
    public void setYearPublished(int pub)
    {
        yearPublished = pub;
    }
    
    public void setBookCondtion (String con)
    {
        condition = con;
    }
    
    public void setBookPrice(int number)
    {
        price = number;
    }
    
    public void setBookGenre(String gen)
    {
        genre = gen;
    }
    
    public void setBookID(int bID)
    {
        id = bID;
    }
    
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
    
    public int getBookPrice()
    {
        return price;
    }
    
    public String getBookGenre()
    {
        return genre;
    }
    
    public int getBookID()
    {
        return id;
    }
    
    public void PrintDetails()
    {
        System.out.println("The title of the book is: " +title);
        System.out.println("The author of the book is: " +author);
        System.out.println("Year it was published: " +yearPublished);
        System.out.println("Condition of book: " +condition);
        System.out.println("The book cost: " +price);
        System.out.println("Genre of the book is: " +genre);
        System.out.println("ID of the book: " +id);

    }
}
