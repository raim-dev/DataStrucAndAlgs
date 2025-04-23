package twopointers;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

 //test case:
 /*
  * Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
  */

public class TwoSum{

    public static void main(String[] args){
        int[] nums = {2,7,11,15}; int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                //return new int[]{map.get(x), i};
                System.out.println(Arrays.toString(new int[]{map.get(x), i}));
                return;
            }
            map.put(nums[i], i);    
        }
        System.out.println("null");

    }
}
