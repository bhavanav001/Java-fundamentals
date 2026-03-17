package module6_7;

public class majorelement {

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                candidate = nums[i];
                votes = 1;
            }
            else if (nums[i] == candidate) {
                votes++; 
            } 
            else {
                votes--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,4,2,4,4,2,4,4};
        System.out.println(majorityElement(nums));
    }
}