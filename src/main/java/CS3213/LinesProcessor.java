package CS3213;

import java.util.*;

/**
 * Created by WhyX on 3/9/16.
 */
public class LinesProcessor {
    public static String DELIMITER = " ";

    private List<String> _lines;
    private RequiredWords _requiredWords;

    public LinesProcessor() {
        this._lines = new ArrayList<String>();
        this._requiredWords = RequiredWords.getRequiredWords();
    }

    public void addLines(String[] lines) {
        for (String str : lines) {
            this._lines.add(str);
        }
    }

    public String[] getProcessedLines() {
        List<String> processedLines = new ArrayList<String>(this._lines);

        Iterator<String> iter = processedLines.iterator();
        while (iter.hasNext()) {
            String lineToCheck = iter.next();
            String[] words = lineToCheck.split(DELIMITER);
            String firstWord = words[0];
            if (this._requiredWords.isRequiredWord(firstWord)) {
                iter.remove();
            }
        }

        return processedLines.toArray(new String[processedLines.size()]);
    }
}
