class Solution {
   
    static boolean[] visited;
    static Queue<Integer> q=new LinkedList<>();
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        visited=new boolean[n];
        int count=0;
    for(int i=0;i<n;i++){
            if(!visited[i]){
               // count++;
                bfs(i,isConnected);
                count++;
            }
    }
    return count;
    }
    public static void bfs(int start,int[][] isConnected){
            visited[start]=true;
            q.offer(start);
            while(!q.isEmpty()){
                int current=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[current][i]==1 && !visited[i]  ){
                    visited[i]=true;
                    q.offer(i);
                }
            }
            }
    }
}