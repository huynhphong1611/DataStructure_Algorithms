package hp.tech;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1823_Find_the_Winner_of_the_Circular_Game {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findTheWinner(405,374));


    }

    static class Solution{
        public Solution() {
        }

        public int findTheWinner(int n, int k) {
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }
            while(queue.size() > 1) {
                int i = k;

                while (i > 1) {
                    int temp = queue.poll();
                    System.out.println("Lay player  dua ve sau queue " + temp);
                    queue.offer(temp);
                    i--;
                }

                int temp1 = queue.poll();
                System.out.println("player leave " + temp1);

            }

            return queue.poll();
        }
    }


}
