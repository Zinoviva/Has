import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (char symbolText : newText.text.toCharArray()) {  //проверка, что буква является символом
            if (Character.isLetter(symbolText)) {
                if (!map.containsKey(symbolText))
                    map.put(symbolText, 1);
                else
                    map.put(symbolText, map.get(symbolText) + 1);
            }
        }

        int maxAmount = (Collections.max(map.values()));   //максимальное значение
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxAmount) {
                System.out.println("Максимальное значение" + entry.getKey());
            }
        }
        int minAmount = (Collections.min(map.values()));    //минимальное значение
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minAmount || entry.getValue() == null) {
                System.out.println("Минимальное значение " + entry.getKey());
                break;
            }
        }
    }
    public static class newText {  // статическое текстовое поле условие
        static String text;

        static {
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed" +
                    " do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                    "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " +
                    "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore" +
                    " eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                    "qui officia deserunt mollit anim id est laborum.";
        }
    }
}

