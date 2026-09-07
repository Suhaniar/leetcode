class Solution {

    int[] colour;
    boolean[] visited;

    public boolean dfs(int node, int[][] graph) {

        visited[node] = true;

        for (int neighbour : graph[node]) {

            if (!visited[neighbour]) {

                colour[neighbour] = 1 - colour[node];

                if (!dfs(neighbour, graph)) {
                    return false;
                }
            }

            else if (colour[neighbour] == colour[node]) {

                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        visited = new boolean[n];
        colour = new int[n];

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                colour[i] = 0;

                if (!dfs(i, graph)) {
                    return false;
                }
            }
        }

        return true;
    }
}