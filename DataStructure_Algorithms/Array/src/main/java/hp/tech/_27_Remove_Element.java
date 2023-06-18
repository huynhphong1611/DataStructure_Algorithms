package hp.tech;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeElement2(nums, val));

    }

    static class Solution {
        public int removeElement(int[] a, int val) {
            int n = a.length;
            for (int i = 0; i < n; ) {
                if (a[i] == val) {
                    // xoa  don cac phafn tu tien len 1 don vi
                    for (int j = i; j <= n-2; j++) {
                        a[j] = a[j+ 1];
                    }
                    n--;
                } else {
                    i++;
                }

            }
            System.out.println(n);
            return n;
        }

        // ky thuat 2 con tro
        public int removeElement2(int[] a, int val) {
            int k = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != val) {
                    a[k] = a[i];
                    k++;
                }
            }
            return k;
        }
    }
}
