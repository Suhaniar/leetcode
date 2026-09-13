class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Build graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // prerequisite → course
        for(int i = 0; i < prerequisites.length; i++) {

            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];

            graph.get(prereq).add(course);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        // DFS
        for(int i = 0; i < numCourses; i++) {

            if(!visited[i]) {

                if(dfs(i, graph, visited, path)) {
                    return false;
                }
            }
        }

        return true;
    }


    public boolean dfs(int course,
                       ArrayList<ArrayList<Integer>> graph,
                       boolean[] visited,
                       boolean[] path) {

        // Already in current DFS path
        if(path[course]) {
            return true;
        }

        // Already completely explored
        if(visited[course]) {
            return false;
        }

        visited[course] = true;
        path[course] = true;

        for(int next : graph.get(course)) {

            if(dfs(next, graph, visited, path)) {
                return true;
            }
        }

        path[course] = false;

        return false;
    }
}