class Solution {
    public static boolean isPalindrome(int x) {
        int i = 0;
        int base = 10;
        int size = 0;
        
        if ((x < 0))
            return false;
        
        while(base <= x) {
            size ++;
            base = (int) Math.pow(10, size);
        }
        
        if (size == 1)
            return true;
        
        int[] nums = new int[size];
        
        base = 10;
        for(i = 0; i < size; i ++) {
            nums[i] = (x % ((int) Math.pow(10, i+1)) / ((int) Math.pow(10, i)));
            x = x - nums[i];
        }
        
        int j = size - 1;
        for(i = 0; i < size; i ++) {
            if(i == j) 
                break;
            
            if(nums[i] != nums[j])
                return false;

            j --;
        }
        
        return true;
    }

    public static void main(String[] args) {
        boolean b = isPalindrome(10);
    }
}