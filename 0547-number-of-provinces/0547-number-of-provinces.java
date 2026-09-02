class Solution { 
    int count = 0; 
    boolean[] visited; 

    public int findCircleNum(int[][] isConnected) { 
        
        int n = isConnected.length;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, isConnected);
            }
        }

        return count;
    }

    void dfs(int city, int[][] isConnected) {
        visited[city] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visited[i]) {
                dfs(i, isConnected);
            }
        }
    }
}