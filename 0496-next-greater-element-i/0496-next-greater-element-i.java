import java.util.ArrayList;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int elemchk = nums1[i]; 
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j;
                    boolean found = false; 
                    while (k + 1 < nums2.length) {
                        if ( nums2[j] < nums2[k + 1] ) {
                            arr.add(nums2[k + 1]);
                            found = true;
                            break;
                        }
                        k++;
                    }
                    if (!found) { 
                        arr.add(-1);
                    }
                }
            }
        }
        
        
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}