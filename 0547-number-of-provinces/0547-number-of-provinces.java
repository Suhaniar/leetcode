import java.util.*;

class Solution {

    boolean[] visited;

    public void dfs(int city, int[][] isConnected) {

        visited[city] = true;

        for (int neighbour = 0;
             neighbour < isConnected.length;
             neighbour++) {

            if (isConnected[city][neighbour] == 1
                    && !visited[neighbour]) {

                dfs(neighbour, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                dfs(i, isConnected);

                provinces++;
            }
        }

        return provinces;
    }
}