public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char c, CharacterPatternMap[] characterMaps) {
        for (int i = 0; i < characterMaps.length; i++) {
            if (characterMaps[i].getCharacter() == c) {
                return characterMaps[i].getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

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

        CharacterPatternMap[] characterMaps = {oMap, pMap, sMap};

        String[] oPattern = getCharacterPattern('O', characterMaps);
        String[] pPattern = getCharacterPattern('P', characterMaps);
        String[] sPattern = getCharacterPattern('S', characterMaps);

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
