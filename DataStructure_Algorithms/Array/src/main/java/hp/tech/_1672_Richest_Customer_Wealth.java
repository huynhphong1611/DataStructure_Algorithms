package hp.tech;

public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accs = new int[][] {{1,5}, {7,3}, {3,5}};
        Solution solution = new Solution();
        System.out.println( solution.maximumWealth(accs));
    }

    static class Solution {
        public int maximumWealth(int[][] accounts) {
            int sumMax = 0;
            int soHang = accounts.length;
            int soCot = accounts[0].length;
            for (int i = 0; i < soHang; i++) {
                int sum = 0;

                for (int j = 0; j < soCot; j++) {
                    sum += accounts[i][j];
                    System.out.print(accounts[i][j] + " ");
                }

                if (sum > sumMax) {
                    sumMax = sum;
                }
                System.out.println();

            }
            return sumMax;
        }
    }
}
