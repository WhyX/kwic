package test;

import CS3213.RequiredWords;
import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by lareinating on 1/9/16.
 */
public class RequiredWordsTest {

    @Test
    public void testGetRequiredLines() {
        String[] lines = {"tomorrow line", "no line", "a test", "may day"};
        RequiredWords reqWords = new RequiredWords(Arrays.asList("tomorrow", "may"), lines);
        String[] res = reqWords.getLines();
        assertTrue(res.length == 2);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);

        String[] lines2 = {"Tomorrow line", "no line", "A Test", "May day"};
        RequiredWords reqWords2 = new RequiredWords(Arrays.asList("tomorrow", "A"), lines2);
        String[] res2 = reqWords2.getLines();
        assertTrue(res2.length == 2);
        assertEquals("Tomorrow line", res[0]);
        assertEquals("A Test", res[1]);
        assertFalse(res[1].equals("no line"));

    }
}
