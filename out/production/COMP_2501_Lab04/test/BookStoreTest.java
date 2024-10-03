import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the BookStore class.
 */
public class BookStoreTest
{
    private BookStore store;

    @Before
    public void setUp() {
        store = new BookStore("Books-R-Us");
    }

    @Test
    public void testBookStoreConstructor()
    {
        // Test the name conversion
        BookStore amazonStore = new BookStore("Amazon");
        assertEquals("Chapters", amazonStore.getName());
        assertEquals("Books-R-Us", store.getName());
    }

    @Test
    public void testPrintAllTitles()
    {
        // Capture output to verify the print method
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        store.printAllTitles();
        final String output = outputStream.toString();

        assertTrue(output.contains("THE ADVENTURES OF AUGIE MARCH"));
        assertTrue(output.contains("ANIMAL FARM"));
    }

    @Test
    public void testPrintTitlesContaining()
    {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        store.printTitlesContaining("the", false);
        final String output = outputStream.toString();

        // Verify that titles containing "the" are printed
        assertTrue(output.contains("The Adventures of Augie March"));
        assertTrue(output.contains("All the King’s Men"));
    }

    @Test
    public void testPrintTitlesOfLength()
    {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        store.printTitlesOfLength(13);
        final String output = outputStream.toString();

        // Verify that titles of length 13 are printed
        assertTrue(output.contains("The Assistant"));
        assertTrue(output.contains("The Big Sleep"));
    }

    @Test
    public void testGetLongestTitle()
    {
        assertEquals("Are You There God? It's Me, Margaret.", store.getLongest("title"));
    }

    @Test
    public void testGetLongestAuthor()
    {
        assertEquals("Alan Moore and Dave Gibbons", store.getLongest("author"));
    }
}
