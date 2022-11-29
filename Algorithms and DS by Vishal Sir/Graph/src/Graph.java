import java.util.Stack;

public class Graph {
    int [] vertices;
    int [][] adjMat;
    int noOfVertices;

    public Graph(int noOfVertices) {
        this.noOfVertices = noOfVertices;
        vertices = new int[noOfVertices];
        adjMat = new int[noOfVertices][noOfVertices];

        init();
    }

    private void init() {
        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter values for vertices: ");
        for(int i = 0; i < vertices.length; i++) {
            //vertices[i] = scanner.nextInt();
            vertices[i] = i + 1;
        }

        int arr[] = {0,1,1,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0};
        int k = 0;

        for(int i = 0; i < adjMat.length; i++) {
            for(int j = 0; j < adjMat[i].length; j++) {
                adjMat[i][j] = arr[k++];
                /*System.out.println("Edge between " + vertices[i] + " & " + vertices[j] + " ? ");
                adjMatrix[i][j] = scanner.nextInt();*/
            }
        }

    }

    public void display() {
        System.out.print("  ");
        for(int vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        for(int i = 0; i < noOfVertices; i++) {
            System.out.print(vertices[i] + " ");
            for(int j = 0; j < noOfVertices; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void dfs(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        int [] visited = new int[noOfVertices];

        System.out.print("DFS: ");

        int d = startVertex;
        System.out.print(vertices[d] + " ");
        visited[d] = 1;
        stack.push(d);

        while (!stack.empty()) {
            for(int i = 0; i < vertices.length; i++) {
                if(adjMat[d][i] == 1 && visited[i] == 0) {
                    System.out.print(vertices[i] + " ");
                    visited[i] = 1;
                    stack.push(i);
                    d = i;
                    i = -1;
                }
            }
            d = stack.pop();
        }

        System.out.println();
    }

    public void dfs(int startIndex, int [] visited) {

        if(visited[startIndex] == 0) {
            System.out.print(vertices[startIndex] + " ");
            visited[startIndex] = 1;
            for(int i = 0; i < vertices.length; i++) {
                if (adjMat[startIndex][i] == 1 && visited[i] == 0) {
                    dfs(i, visited);
                }
            }
        }
    }

    public void bfs(int startIndex) {
        int [] queue = new int[100];
        int front = -1, rear = -1;
        int [] visited = new int[noOfVertices];

        queue[++rear] = startIndex;
        front = rear = 0;

        System.out.print("BFS: ");

        while(front <= rear) {
            int d = queue[front++];
            if(visited[d] == 0) {
                System.out.print(vertices[d]  + " ");
                visited[d] = 1;

                for(int i = 0; i < noOfVertices; i++) {
                    if(adjMat[d][i] == 1 && visited[i] == 0) {
                        queue[++rear] = i;
                    }
                }
            }
        }
        System.out.println();

    }


}
