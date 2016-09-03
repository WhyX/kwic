package test;

import org.junit.Test;
import CS3213.RequiredWords;
import static org.junit.Assert.*;

/**
 * Created by lareinating on 3/9/16.
 */
public class RequiredWordsTest {
    @Test
    public void testIsRequiredWord() throws Exception {
        RequiredWords requiredWords = RequiredWords.getRequiredWords();

        assertFalse(requiredWords.isRequiredWord("Tomorrow"));

        requiredWords.addRequiredWord("Tomorrow");
        assertTrue(requiredWords.isRequiredWord("Tomorrow"));
        assertTrue(requiredWords.isRequiredWord("tomorrow")); // case insensitive
        assertFalse(requiredWords.isRequiredWord("Today"));

        requiredWords.addRequiredWord("me");
        requiredWords.addRequiredWord("tomorrow"); // duplicated
        requiredWords.removeRequiredWord("tomorrow");
        assertFalse(requiredWords.isRequiredWord("tomorrow"));
        assertTrue(requiredWords.isRequiredWord("me"));

        requiredWords.addRequiredWord("");
        requiredWords.removeRequiredWord("me");
        assertTrue(requiredWords.isRequiredWord(""));
        assertFalse(requiredWords.isRequiredWord("me"));
    }
}
