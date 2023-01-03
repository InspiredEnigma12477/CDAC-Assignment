public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.display();

        g.dfs(0);
        g.dfs(0, new int[9]);
        System.out.println();
        //g.dfs(3);
        g.bfs(0);
        System.out.println();
        g.bfs(3);
        System.out.println();
    }
}
