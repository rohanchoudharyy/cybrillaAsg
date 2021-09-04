/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scn = new Scanner(System.in);
	    int[] arr = new int[6];
		//int arr[] = {-1, 0, 1, 2, -1, 4};
		//enter input in the following way => -1 0 1 2 -1 4
		for(int i=0;i<arr.length;i++){
		    arr[i]=scn.nextInt();
		}
		List<List<Integer>> ans = new ArrayList<>();
		ans = threeSum(arr);
		for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        } 
		
	}
	public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    
    for (int i = 0; i + 2 < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {              
            continue;
        }
        int j = i + 1, k = nums.length - 1;  
        int target = -nums[i];
        while (j < k) {
            if (nums[j] + nums[k] == target) {
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) j++;  
                while (j < k && nums[k] == nums[k + 1]) k--;  
            } else if (nums[j] + nums[k] > target) {
                k--;
            } else {
                j++;
            }
        }
    }
    return res;
}
}
