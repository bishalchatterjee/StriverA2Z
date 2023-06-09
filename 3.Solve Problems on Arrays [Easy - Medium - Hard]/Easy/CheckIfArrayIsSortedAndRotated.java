class CheckIfArrayIsSortedAndRotated {
    static boolean check(int[] nums) {
        int breakPointsInArray=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1) % nums.length]) breakPointsInArray++;
        }
        return (breakPointsInArray<=1);
    }

    public static void main(String[] args) {
//        int[] nums={3,4,5,1,2}; // breakPoints -> 1 -> true
        int[] nums={3,5,1,2,4}; // breakPoints -> 2 -> false
        System.out.println(check(nums));
    }
}

/*
Time Complexity - O(N)
Space Complexity - O(1)
Status - Optimal
 */