package test;

import org.junit.Test;
import CS3213.LinesProcessor;
import static org.junit.Assert.*;
import java.util.*;
/**
 * Created by lareinating on 3/9/16.
 */
public class LinesProcessorTest {
    @Test
    public void testGetProcessLines() {
        LinesProcessor linesProcessor = new LinesProcessor();
        String[] lines1 = {"tomorrow line", "no line"};
        String[] lines2 = {"a test", "may day"};
        linesProcessor.addLines(lines1);
        linesProcessor.addLines(lines2);
        String[] res =  linesProcessor.getProcessedLines();
        assertTrue(res.length == 2);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);

        LinesProcessor linesProcessor2 = new LinesProcessor();
        String[] lines3 = {"Tomorrow line", "no line", "A test", "may Day"};
        linesProcessor2.addLines(line3);
        String[] res2 =  linesProcessor2.getProcessedLines();
        assertTrue(res2.length == 2);
        assertEquals("Tomorrow line", res[0]);
        assertEquals("A Test", res[1]);
        assertFalse(res[1].equals("no line"));
    }
}
