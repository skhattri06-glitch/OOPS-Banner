import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    public static void main(String[] args) {
        // Step 1: Create a lookup table (HashMap) to store character patterns
        Map<Character, String[]> patternMap = getCharacterPatterns();

        // Step 2: The goal is to display "OOPS"
        String message = "OOPS";

        // Step 3: Use a function to iterate and render the banner
        displayBannerMessage(message, patternMap);
    }

    /**
     * UC8 Utility Method: Generate and store character patterns in a Map.
     * Maps each Character to its multi-line ASCII representation (String array).
     */
    public static Map<Character, String[]> getCharacterPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        patterns.put('P', new String[]{
            "  ****** ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });

        patterns.put('S', new String[]{
            "  ****** ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });

        return patterns;
    }

    /**
     * UC8 Utility Method: Renders the banner message by mapping each letter to its pattern.
     * Iterates through each row (7 lines total) and appends pattern parts for each character.
     */
    public static void displayBannerMessage(String message, Map<Character, String[]> patternMap) {
        // Banner height is assumed to be 7 lines based on UC2
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
