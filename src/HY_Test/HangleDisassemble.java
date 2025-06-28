package HY_Test;

public class HangleDisassemble {

        private static final char[] CHO = {
                'ㄱ','ㄲ','ㄴ','ㄷ','ㄸ','ㄹ','ㅁ','ㅂ','ㅃ','ㅅ',
                'ㅆ','ㅇ','ㅈ','ㅉ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'
        };

        private static final char[] JUNG = {
                'ㅏ','ㅐ','ㅑ','ㅒ','ㅓ','ㅔ','ㅕ','ㅖ','ㅗ','ㅘ',
                'ㅙ','ㅚ','ㅛ','ㅜ','ㅝ','ㅞ','ㅟ','ㅠ','ㅡ','ㅢ',
                'ㅣ'
        };

        private static final char[] JONG = {
                ' ', 'ㄱ','ㄲ','ㄳ','ㄴ','ㄵ','ㄶ','ㄷ','ㄹ','ㄺ',
                'ㄻ','ㄼ','ㄽ','ㄾ','ㄿ','ㅀ','ㅁ','ㅂ','ㅄ','ㅅ',
                'ㅆ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'
        };

        private static final int HANGLE_BASE = 0xAC00;
        private static final int CHO_UNIT = 21 * 28;
        private static final int JUNG_UNIT = 28;

        public static char getChoseong(char syllable) {
            int code = syllable - HANGLE_BASE;
            int index = code / CHO_UNIT;
            return CHO[index];
        }

        public static char getJungseong(char syllable) {
            int code = syllable - HANGLE_BASE;
            int index = (code % CHO_UNIT) / JUNG_UNIT;
            return JUNG[index];
        }

        public static char getJongseong(char syllable) {
            int code = syllable - HANGLE_BASE;
            int index = code % JUNG_UNIT;
            return JONG[index];
        }

        // 디버깅용 출력 메서드
        public static void printDecomposition(char ch) {
            if (ch < 0xAC00 || ch > 0xD7A3) {
                System.out.println(ch + "는 한글 음절이 아닙니다.");
                return;
            }

            System.out.println("글자: " + ch);
            System.out.println("초성: " + getChoseong(ch));
            System.out.println("중성: " + getJungseong(ch));
            char jong = getJongseong(ch);
            if (jong != ' ') {
                System.out.println("종성: " + jong);
            } else {
                System.out.println("종성 없음");
            }
        }
}


