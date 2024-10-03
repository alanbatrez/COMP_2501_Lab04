/**
 * Represents a novel with a title, author, and year published.
 *
 * @author Camila (Kamila Vaisman)
 * @author Alan Batrez
 * @author Hossein
 * @version 1.0
 */
public final class Novel
{
    private final String title;
    private final String author;
    private final int yearPublished;

    /**
     * Constructs a new Novel object.
     *
     * @param title the title of the novel
     * @param author the author of the novel
     * @param yearPublished the year the novel was published
     */
    public Novel(final String title,
                 final String author,
                 final int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYearPublished()
    {
        return yearPublished;
    }
}
