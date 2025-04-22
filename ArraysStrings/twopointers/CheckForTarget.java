package twopointers;

public class CheckForTarget{

    /*
     * Given a sorted array of unique integers and a target integer, 
     * return true if there exists a pair of numbers that sum to target, false otherwise
     */

    public static void main(String[] args){

        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15}; int target = 13;
        int left = 0;
        int right = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            int sumTarget = nums[left] + nums[right];
            if(sumTarget == target) {System.out.println("True"); return; }
            else if(sumTarget > target) right--;
            else left++;
        }

        System.out.println("False");

    }
}