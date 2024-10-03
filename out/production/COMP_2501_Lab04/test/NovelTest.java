import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Novel class.
 */
public class NovelTest
{
    @Test
    public void testNovelConstructorAndAccessors()
    {
        final Novel novel = new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        assertEquals("The Great Gatsby", novel.getTitle());
        assertEquals("F. Scott Fitzgerald", novel.getAuthor());
        assertEquals(1925, novel.getYearPublished());
    }
}
