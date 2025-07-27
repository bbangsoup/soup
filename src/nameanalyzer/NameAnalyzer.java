package nameanalyzer;

// 글자 하나 : 자모 분해 : 획수 계산
public class NameAnalyzer {

    private char a;
    private char b;
    private char c;

    public static int getTotalStroke(char syllable) {
        if (!isHangulSyllable(syllable)) return 0;

        char cho = HangleUtil.getChoseong(syllable);
        char jung = HangleUtil.getJungseong(syllable);
        char jong = HangleUtil.getJongseong(syllable);

        int total = 0;
        total += Hangle.getStroke(cho);
        total += Hangle.getStroke(jung);
        total += Hangle.getStroke(jong);




        return total;



    }

    private static boolean isHangulSyllable(char ch) {
        return ch >= 0xAC00 && ch <= 0xD7A3;
    }
}
