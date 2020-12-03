ass Solution {
    public int[] sort(int[] nums, int start, int end) {
        if (start == end)
            return nums;
        
        int size = end - start;
        int left = start;
        int right = end;
        int pivot = start + (size / 2);
        
        while (left < right) {
            if(nums[left] < nums[pivot])
                left ++;
            
            if(nums[right] > nums[pivot])
                right --;
            
            if(nums[left] > nums[pivot] && nums[right] < nums[pivot]) {
                if(nums[left] > nums[right]) {
                    int aux = nums[right];
                    nums[right] = nums[left];
                    nums[left] = aux;
                }
                    
            }
        }
        
        nums = sort(nums, start, start + (size / 2));
        nums = sort(nums, start + (size / 2) + 1, end);
        return nums;                
    }
    
    public int[] sort(int[] nums) {
        return sort(nums, 0, nums.length-1);
    }
    
    public int[] twoSum(int[] nums, int target) {
        nums = sort(nums);
        
        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums.length; j ++) {
                if ((nums[i] + nums[j]) == target)
                    return new int[]{i,j};
                
                if ((nums[i] + nums[j]) > target)
                    break;   
            }   
        }
        return null;
    }


    public static void main(String[] args) {
        new Solution().twoSum(new int[] {2, 7, 11, 15}, 0);
    }
}
