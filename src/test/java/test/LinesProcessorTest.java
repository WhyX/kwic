package test;

import org.junit.Test;
import CS3213.LinesProcessor;
import static org.junit.Assert.*;

/**
 * Created by lareinating on 3/9/16.
 */
public class LinesProcessorTest {
    @Test
    public void testGetProcessLines() {
        LinesProcessor linesProcessor = new LinesProcessor();
        linesProcessor.addLines(["tomorrow line", "no line"]);
        linesProcessor.addLines(["a test", "may day"]);
        String[] res =  linesProcessor.getProcessedLines();
        assertTrue(res.length == 2);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);

        LinesProcessor linesProcessor2 = new LinesProcessor();
        linesProcessor2.addLines(["Tomorrow line", "no line", "A test", "may Day"]);
        String[] res2 =  linesProcessor2.getProcessedLines();
        assertTrue(res2.length == 2);
        assertEquals("Tomorrow line", res[0]);
        assertEquals("A Test", res[1]);
        assertFalse(res[1].equals("no line"));
    }
}
