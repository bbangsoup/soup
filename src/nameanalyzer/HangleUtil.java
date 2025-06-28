package nameanalyzer;

// 한글 : 초성,중성,종성 추출
public class HangleUtil {

    private static final char[] CHO = {
            'ㄱ','ㄲ','ㄴ','ㄷ','ㄸ','ㄹ','ㅁ','ㅂ','ㅃ','ㅅ',
            'ㅆ','ㅇ','ㅈ','ㅉ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'
    };

    private static final char[] JUNG = {
            'ㅏ','ㅐ','ㅑ','ㅒ','ㅓ','ㅔ','ㅕ','ㅖ','ㅗ','ㅘ','ㅙ',
            'ㅚ','ㅛ','ㅜ','ㅝ','ㅞ','ㅟ','ㅠ','ㅡ','ㅢ','ㅣ'
    };

    private static final char[] JONG = {
            ' ', 'ㄱ','ㄲ','ㄳ','ㄴ','ㄵ','ㄶ','ㄷ','ㄹ','ㄺ','ㄻ',
            'ㄼ','ㄽ','ㄾ','ㄿ','ㅀ','ㅁ','ㅂ','ㅄ','ㅅ','ㅆ','ㅇ',
            'ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'
    };

    private static final int HANGUL_BASE = 0xAC00;
    private static final int CHO_UNIT = 21 * 28;
    private static final int JUNG_UNIT = 28;

    public static char getChoseong(char syllable) {
        int code = syllable - HANGUL_BASE;
        int index = code / CHO_UNIT;
        return CHO[index];
    }

    public static char getJungseong(char syllable) {
        int code = syllable - HANGUL_BASE;
        int index = (code % CHO_UNIT) / JUNG_UNIT;
        return JUNG[index];
    }

    public static char getJongseong(char syllable) {
        int code = syllable - HANGUL_BASE;
        int index = code % JUNG_UNIT;
        return JONG[index];
    }
}
