public class repeated_num {
    public int findRepeatedNumber(int[] nums) {
        int slow = 0;
        int fast = 0;

        // Phase 1: Find meeting point
        do { 
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle (repeated number)
        slow = 0;  // Reset slow to start, DO NOT redeclare with 'int'

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        repeated_num obj=new repeated_num();
        int[] nums={1,2,3,4,5,3,5};
        int result=obj.findRepeatedNumber(nums);
        System.out.println("Repeated Number: " + result);
    }
}
