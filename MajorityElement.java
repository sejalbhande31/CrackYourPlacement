class Solution {
    public int majorityElement(int[] nums) {
        // int majority = nums[0];
        // int votes=1;

        // for(int i=1;i<nums.length;i++){
        //     if(votes==0){
        //         votes++;
        //         majority=nums[i];
        //     }else if(majority==nums[i]){
        //         votes++;
        //     }else{
        //         votes--;
        //     }
        // }

        // int count = 0;
        // for (int num : nums) {
        //     if (num == majority) {
        //         count++;
        //     }
        // }

        // if (count > nums.length / 2) {
        //     return majority;
        // } else {
        //     return -1; // No majority element
        // }

        int majority = nums[0];
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==majority){
                count++;
            }else{
                count--;
                if(count==0){
                    majority=nums[i];
                    count++;
                }
            }
        }
        return majority;


    }
}