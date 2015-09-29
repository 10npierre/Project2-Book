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
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, int bborrowed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = bborrowed;
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
        if (refNumber.length() ==0){
            System.out.println("Refernce Number ZZZ");
            System.out.println("Error: Refernce number must be greater than 0");
        }else{
            refNumber = ref;
        }
    }
    
    public void setBorrowed (int bookborrower)
    {
        bookborrower = borrowed;
        bookborrower ++;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printDetails()
    {
        System.out.println("Author of book: " +author);
        System.out.println("Title of book: " +title);
        System.out.println("Number of pages: " +pages);
        System.out.println("Refernce number: " +refNumber);
        System.out.println("Number of times book borrowed: " +borrowed);
    }
}
