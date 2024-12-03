class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s; 
        }

        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;
        while (i < s.length()) {

            for (int index = 0; i < s.length() && index < numRows; index++) {
                ans[index] += s.charAt(i++);
            }
      
            for (int index = numRows - 2; i < s.length() && index > 0; index--) {
                ans[index] += s.charAt(i++);
            }
        }

     
        StringBuilder res = new StringBuilder();
        for (String str : ans) {
            res.append(str);
        }
        return res.toString();
    }
}