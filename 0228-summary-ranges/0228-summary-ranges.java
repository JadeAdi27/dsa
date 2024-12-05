import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        if (nums.length == 0) return arr;
        
        int j = nums[0]; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) { 
                continue;
            } else {
                // Add the range to the result
                if (j == nums[i - 1]) {
                    arr.add(String.valueOf(j)); 
                } else {
                    arr.add(j + "->" + nums[i - 1]);
                }
                j = nums[i]; 
            }
        }
        
     
        if (j == nums[nums.length - 1]) {
            arr.add(String.valueOf(j));
        } else {
            arr.add(j + "->" + nums[nums.length - 1]);
        }
        
        return arr;
    }
}
