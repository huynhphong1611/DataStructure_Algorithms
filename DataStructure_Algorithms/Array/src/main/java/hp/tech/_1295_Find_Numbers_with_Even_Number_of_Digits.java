package hp.tech;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public static void main(String[] args) {
        int[] nums =  {555,901,482,1771};
        Solution s = new Solution();
        System.out.println("Output: " + s.findNumbers(nums));

    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int dem = 0;
            for (int i = 0; i < nums.length; i++) {
                if (isEvenNumber(nums[i])) {
                    dem++;
                }
            }

            return dem;
        }

        private boolean isEvenNumber(int num) {
            int k = 0;
            while (num != 0) {
                num = num / 10;
                k ++;
            }
            return k % 2 == 0;
        }
    }
}
