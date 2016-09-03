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
        String[] lines1 = {"tomorrow line", "no line", "a test", "may day"};
        linesProcessor.addLines(lines1);
        linesProcessor.addLines(lines2);
        String[] res =  linesProcessor.getProcessedLines();
        assertTrue(res.length == 4);
        assertEquals("tomorrow line", res[0]);
        assertEquals("may day", res[3]);
    }
}
