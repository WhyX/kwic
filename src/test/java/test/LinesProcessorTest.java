package test;

import CS3213.LinesProcessor;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by lareinating on 3/9/16.
 */
public class LinesProcessorTest {
    @Test
    public void testGetProcessLines() {
        LinesProcessor linesProcessor = new LinesProcessor();
        String[] lines1 = {"tomorrow line", "no line", "a test", "may day"};
        linesProcessor.addLines(lines1);
        String[] res =  linesProcessor.getProcessedLines();
        assertTrue(res.length == 4);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);

        LinesProcessor linesProcessor2 = new LinesProcessor();
        String[] lines2 = {""};
        linesProcessor2.addLines(lines2);
        String[] res2 = linesProcessor2.getProcessedLines();
        assertTrue(res2.length == 1);
        assertEquals("", res2[0]);
        assertFalse(res2.length == 0);
    }
}
