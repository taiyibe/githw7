import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (freq.containsKey(text.charAt(i))) {
                    freq.put(text.charAt(i), freq.get(text.charAt(i)) + 1);
                } else {
                    freq.put(text.charAt(i), 1);
                }
            }
        }

        Integer max = -1, min = Integer.MAX_VALUE;
        Character most = null, least = null;
        for (Character k : freq.keySet()) {
            if (freq.get(k) > max) {
                max = freq.get(k);
                most = k;
            }
            if (freq.get(k) < min) {
                min = freq.get(k);
                least = k;
            }
        }

        System.out.printf("Самая частая буква \"%c\", она встретилась %d раз.\n", most, max);
        System.out.printf("Самая редкая буква \"%c\", она встретилась %d раз.\n", least, min);
    }
}