public class RemoveDuplicate{

    public static void main(String[] args){

        //Remove Duplicates In-Place and Return New Length 
        /**
            Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
            Output: 5 (nums = [0, 1, 2, 3, 4, _, _, _, _, _])

            Input: nums = [1, 1, 2]
            Output: 2 (nums = [1, 2, _])
         */
       
        int[] nums = {1, 1, 2};

        int j = 0; //  to track the position of the next unique element.
        for(int i = 0; i < nums.length; i++){ // i will Iterate through the array
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        
        System.out.println("new lenght " + (j + 1));

        
    }
}