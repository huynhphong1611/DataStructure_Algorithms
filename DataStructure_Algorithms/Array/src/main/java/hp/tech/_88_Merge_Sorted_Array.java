package hp.tech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        Solution s = new Solution();
        s.merge(nums1, m, nums2, n);


    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < nums2.length; i++) {
               mergeNumberInArray(nums2[i], nums1, m);
               m++;
            }
            for (int num: nums1) {
                System.out.println(num);
            }
        }

        private void mergeNumberInArray(int x, int[] a, int m) {
            boolean findNumber = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > x) {
                    findNumber = true;
                    for (int k = m -1 ; k >= j; k --) {
                        a[k+1] = a[k];
                    }
                    a[j] = x;
                    break;
                }
            }

            if (!findNumber) {
                a[m] = x;
            }
        }

        private void mergeNumberInArray2(int x, int[] a, int m) {

        }
    }
}
