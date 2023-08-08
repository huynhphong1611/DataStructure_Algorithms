package hp.tech;

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        System.out.println( new Solution().firstUniqChar("aabb"));
    }

    static class Solution {
        public int firstUniqChar(String s) {
            //leetcode
            char[] chars = s.toCharArray();
            int[] counts = new int[123];

            for (char c : chars) {
                int count = (int) c;
                counts[count] ++;
            }
            int p = 0;
            for (int i = 0; i < chars.length; i++) {
                if (counts[chars[i]] == 1){
                    return i;
                }
            }

            return -1;
        }
    }
}
