package HY_Test;

import java.util.HashMap;
import java.util.Map;

public class HangleJamo {

    // 초성/중성/종성 자모 → 획수 맵핑
    private static final Map<Character, Integer> strokeMap = new HashMap<>();

    static {
        // 자음
        strokeMap.put('ㄱ', 1);
        strokeMap.put('ㄴ', 1);
        strokeMap.put('ㄷ', 2);
        strokeMap.put('ㄹ', 3);
        strokeMap.put('ㅁ', 3);
        strokeMap.put('ㅂ', 4);
        strokeMap.put('ㅅ', 2);
        strokeMap.put('ㅇ', 2);
        strokeMap.put('ㅈ', 3);
        strokeMap.put('ㅊ', 4);
        strokeMap.put('ㅋ', 2);
        strokeMap.put('ㅌ', 3);
        strokeMap.put('ㅍ', 4);
        strokeMap.put('ㅎ', 4);
        strokeMap.put('ㄲ', 2);
        strokeMap.put('ㄸ', 4);
        strokeMap.put('ㅃ', 8);
        strokeMap.put('ㅆ', 4);
        strokeMap.put('ㅉ', 6);

        // 모음
        strokeMap.put('ㅏ', 2);
        strokeMap.put('ㅑ', 3);
        strokeMap.put('ㅓ', 2);
        strokeMap.put('ㅕ', 3);
        strokeMap.put('ㅗ', 2);
        strokeMap.put('ㅛ', 3);
        strokeMap.put('ㅜ', 2);
        strokeMap.put('ㅠ', 3);
        strokeMap.put('ㅡ', 1);
        strokeMap.put('ㅣ', 1);
        strokeMap.put('ㅐ', 3);
        strokeMap.put('ㅒ', 4);
        strokeMap.put('ㅔ', 3);
        strokeMap.put('ㅖ', 4);
        strokeMap.put('ㅘ', 4);
        strokeMap.put('ㅙ', 5);
        strokeMap.put('ㅚ', 3);
        strokeMap.put('ㅝ', 4);
        strokeMap.put('ㅞ', 5);
        strokeMap.put('ㅟ', 3);
        strokeMap.put('ㅢ', 2);
        // 종성
    }

}
