import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        
        List<String> result = new ArrayList<>();
        result.add("");


        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();

            
            for (String combination : result) {
                for (char letter : dict.get(digit).toCharArray()) {
                    temp.add(combination + letter);
                }
            }

          
            result = temp;
        }
        return result;
    }
  
}
