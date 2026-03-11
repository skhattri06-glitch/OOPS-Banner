/**
 * OOPSBannerApp - Displays the word "OOPS" as an ASCII art banner.
 * 
 * This application demonstrates the use of an inner static class
 * (CharacterPatternMap) to encapsulate character-to-pattern mappings,
 * applying key OOP principles such as encapsulation, modularity,
 * immutability, and single responsibility.
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap is a static inner class that encapsulates
     * a character and its corresponding 7-line ASCII art banner pattern.
     * 
     * Being a static inner class, it can be instantiated without
     * needing an instance of the outer class OOPSBannerApp.
     */
    static class CharacterPatternMap {

        /** The character this map represents */
        private char character;

        /** The 7-line pattern array for this character */
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap with the given character
         * and its corresponding banner pattern.
         * 
         * @param character the character to map
         * @param pattern   the 7-line String array representing the banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character stored in this map.
         * 
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the 7-line banner pattern for this character.
         * 
         * @return the pattern as a String array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Searches through an array of CharacterPatternMap objects and
     * returns the banner pattern for the specified character.
     * 
     * @param c              the character to look up
     * @param characterMaps  the array of CharacterPatternMap objects to search
     * @return the pattern String array if found, or null if not found
     */
    public static String[] getCharacterPattern(char c, CharacterPatternMap[] characterMaps) {
        for (int i = 0; i < characterMaps.length; i++) {
            if (characterMaps[i].getCharacter() == c) {
                return characterMaps[i].getPattern();
            }
        }
        return null;
    }

    /**
     * Main method - entry point of the application.
     * Creates CharacterPatternMap instances for O, P, and S,
     * assembles the "OOPS" banner using StringBuilder, and prints it.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap instances for each character
        CharacterPatternMap oMap = new CharacterPatternMap('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        CharacterPatternMap pMap = new CharacterPatternMap('P', new String[]{
            " ******  ",
            " *    *  ",
            " ******  ",
            " *       ",
            " *       ",
            " *       ",
            " *       "
        });

        CharacterPatternMap sMap = new CharacterPatternMap('S', new String[]{
            "   ***   ",
            " **      ",
            "  **     ",
            "    ***  ",
            "       **",
            " **    **",
            "   ***   "
        });

        // Store all character maps in an array of objects
        CharacterPatternMap[] characterMaps = {oMap, pMap, sMap};

        // Retrieve patterns using the utility method
        String[] oPattern = getCharacterPattern('O', characterMaps);
        String[] pPattern = getCharacterPattern('P', characterMaps);
        String[] sPattern = getCharacterPattern('S', characterMaps);

        // Assemble and print the banner using StringBuilder
        for (int i = 0; i < oPattern.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(oPattern[i]).append(" ");
            sb.append(oPattern[i]).append(" ");
            sb.append(pPattern[i]).append(" ");
            sb.append(sPattern[i]);
            System.out.println(sb.toString());
        }
    }
}
