package hp.tech._1926;

import java.util.*;

public class _Nearest_Exit_from_Entrance_in_Maze {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int [] entrance = {1,2};
        System.out.println(solution.nearestExit(maze, entrance));

    }

    static class Solution {
        //https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/submissions/1022187641
        public Solution() {
        }

        private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        public int nearestExit(char[][] maze, int[] entrance) {

            int rows = maze.length;
            int columes = maze[0].length;
            boolean[][] visited = new boolean[rows][columes];
            Queue<int[]> q = new LinkedList<>();

            q.add(new int[]{entrance[0], entrance[1], 0});
            visited[entrance[0]][entrance[1]] = true;

            while(!q.isEmpty()) {
                int[] pos = q.poll();
                // tren duoi trai phai
                for (int[] item: DIRECTIONS) {
                    // neu vi tri moi di duoc thi se di
                    int newRow = pos[0] + item[0];
                    int newCol = pos[1] + item[1];

                    if (newRow >= 0 && newRow < rows
                        && newCol >=0 && newCol < columes
                            && maze[newRow][newCol] == '.'
                            && !visited[newRow][newCol]) {
                        if (exit(newRow, newCol, rows, columes)) {
                            return ++pos[2];
                        } else {
                            visited[newRow][newCol] = true;
                            q.add(new int[]{newRow, newCol, pos[2] + 1});
                        }
                    }
                }

            }
            return -1;
        }


        public boolean exit(int row, int colume, int rows, int columes) {
            return row == 0 || colume == 0 || row == rows - 1 || colume == columes - 1;
        }
    }
}
