class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int spaceIndex = 0; // Pointer for the spaces array
        
        for (int j = 0; j < charArray.length; j++) {
            // Check if the current character index matches a space index
            if (spaceIndex < spaces.length && j == spaces[spaceIndex]) {
                sb.append(' '); // Append a space
                spaceIndex++;   // Move to the next space index
            }
            sb.append(charArray[j]); // Append the current character
        }
        
        return sb.toString();
    }
}
