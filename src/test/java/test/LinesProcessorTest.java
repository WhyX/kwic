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
        linesProcessor.addLines("tomorrow line");
        linesProcessor.addLines("no line");
        linesProcessor.addLines("a test");
        linesProcessor.addLines("may day");
        String[] res =  linesProcessor.getProcessLines();
        assertTrue(res.length == 2);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);

        LinesProcessor linesProcessor2 = new LinesProcessor();
        linesProcessor2.addLines("Tomorrow line");
        linesProcessor2.addLines("no line");
        linesProcessor2.addLines("A test");
        linesProcessor2.addLines("may Day");
        String[] res2 =  linesProcessor2.getProcessLines();
        assertTrue(res2.length == 2);
        assertEquals("Tomorrow line", res[0]);
        assertEquals("A Test", res[1]);
        assertFalse(res[1].equals("no line"));
    }
}
