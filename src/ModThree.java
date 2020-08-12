// Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

public class ModThree {
    public boolean modThree(int[] nums) {
        boolean triplets = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 == 0) {
                triplets = true;
                break;
            }
            if (nums[i]%2 != 0 && nums[i+1]%2 != 0 && nums[i+2]%2 != 0) {
                triplets = true;
                break;
            }
        }
        return triplets;
    }
}
