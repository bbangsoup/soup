package nameanalyzer;

import java.util.HashMap;
import java.util.Map;

// 자모별 획수 정보 저장
public class Hangle {

    private static final Map<Character, Integer> strokeMap = new HashMap<>();

    static {
        // 초성 (ㄱ ~ ㅎ)
        strokeMap.put('ㄱ', 1);
        strokeMap.put('ㄲ', 2);
        strokeMap.put('ㄴ', 1);
        strokeMap.put('ㄷ', 2);
        strokeMap.put('ㄸ', 4);
        strokeMap.put('ㄹ', 3);
        strokeMap.put('ㅁ', 3);
        strokeMap.put('ㅂ', 4);
        strokeMap.put('ㅃ', 8);
        strokeMap.put('ㅅ', 2);
        strokeMap.put('ㅆ', 4);
        strokeMap.put('ㅇ', 2);
        strokeMap.put('ㅈ', 3);
        strokeMap.put('ㅉ', 6);
        strokeMap.put('ㅊ', 4);
        strokeMap.put('ㅋ', 2);
        strokeMap.put('ㅌ', 3);
        strokeMap.put('ㅍ', 4);
        strokeMap.put('ㅎ', 4);

        // 중성 (ㅏ ~ ㅣ)
        strokeMap.put('ㅏ', 2);
        strokeMap.put('ㅐ', 3);
        strokeMap.put('ㅑ', 3);
        strokeMap.put('ㅒ', 4);
        strokeMap.put('ㅓ', 2);
        strokeMap.put('ㅔ', 3);
        strokeMap.put('ㅕ', 3);
        strokeMap.put('ㅖ', 4);
        strokeMap.put('ㅗ', 2);
        strokeMap.put('ㅘ', 4);
        strokeMap.put('ㅙ', 5);
        strokeMap.put('ㅚ', 3);
        strokeMap.put('ㅛ', 3);
        strokeMap.put('ㅜ', 2);
        strokeMap.put('ㅝ', 4);
        strokeMap.put('ㅞ', 5);
        strokeMap.put('ㅟ', 3);
        strokeMap.put('ㅠ', 3);
        strokeMap.put('ㅡ', 1);
        strokeMap.put('ㅢ', 2);
        strokeMap.put('ㅣ', 1);

        // 종성 (겹받침 포함 시 계산 시점에서 분해 처리할 수도 있음)
        strokeMap.put(' ', 0); // 종성이 없을 때
        strokeMap.put('ㄱ', 1);
        strokeMap.put('ㄲ', 2);
        strokeMap.put('ㄳ', 3);
        strokeMap.put('ㄴ', 1);
        strokeMap.put('ㄵ', 4);
        strokeMap.put('ㄶ', 5);
        strokeMap.put('ㄷ', 2);
        strokeMap.put('ㄹ', 3);
        strokeMap.put('ㄺ', 4);
        strokeMap.put('ㄻ', 6);
        strokeMap.put('ㄼ', 7);
        strokeMap.put('ㄽ', 5);
        strokeMap.put('ㄾ', 6);
        strokeMap.put('ㄿ', 7);
        strokeMap.put('ㅀ', 7);
        strokeMap.put('ㅁ', 3);
        strokeMap.put('ㅂ', 4);
        strokeMap.put('ㅄ', 6);
        strokeMap.put('ㅅ', 2);
        strokeMap.put('ㅆ', 4);
        strokeMap.put('ㅇ', 2);
        strokeMap.put('ㅈ', 3);
        strokeMap.put('ㅊ', 4);
        strokeMap.put('ㅋ', 2);
        strokeMap.put('ㅌ', 3);
        strokeMap.put('ㅍ', 4);
        strokeMap.put('ㅎ', 4);
    }

    public static int getStroke(char jamo) {
        return strokeMap.getOrDefault(jamo, 0);
    }
}
