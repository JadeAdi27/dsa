import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashSet<Character> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
        HashMap<Character, String> h1 = new HashMap<>();

        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; // Pattern and words must have the same length
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Add to sets
            s1.add(c);
            s2.add(word);

            // Map the pattern character to the word
            if (h1.containsKey(c)) {
                if (!h1.get(c).equals(word)) {
                    return false; // Mismatch in mapping
                }
            } else {
                if (h1.containsValue(word)) {
                    return false; // Word already mapped to another character
                }
                h1.put(c, word);
            }
        }

        // Verify sets
        return s1.size() == s2.size();
    }
}