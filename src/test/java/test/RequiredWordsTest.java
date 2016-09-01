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
    }
}
