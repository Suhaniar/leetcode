import java.util.*;

public class Solution {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    static boolean dfs(int node, int target) {

        if (node == target) {
            return true;
        }

        visited[node] = true;

        for (int i = 0; i < graph.get(node).size(); i++) {

            int neighbour = graph.get(node).get(i);

            if (!visited[neighbour]) {

                if (dfs(neighbour, target)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            visited = new boolean[n + 1];

            // Check if u and v are already connected
            if (dfs(u, v)) {

                // Adding u-v would create a cycle
                return new int[]{u, v};
            }

            // No cycle, so safely add this edge
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return new int[]{-1, -1};
    }

   
}