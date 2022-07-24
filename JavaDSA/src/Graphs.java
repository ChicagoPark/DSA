import java.util.Queue;

public class Graphs {
	private int vertices;
	private int adjMat[][];
	int visited[];

	public Graphs(int n) {
		vertices = n;
		adjMat = new int[n][n];
		visited = new int[this.vertexCount()];
	}

	public void insertEdge(int u, int v, int x) {
		this.adjMat[u][v] = x;
	}

	public void removeEdge(int u, int v) {
		this.adjMat[u][v] = 0;
	}

	public boolean existEdge(int u, int v) {
		return this.adjMat[u][v] != 0;
	}

	public int vertexCount() {
		return this.vertices;
	}

	public int edgeCount() {
		int count = 0;
		for (int i = 0; i < this.vertices; i++)
			for (int j = 0; j < this.vertices; j++)
				if (this.adjMat[i][j] != 0)
					count += 1;
		return count;
	}

	public void edges() {
		System.out.println("Edges: ");
		for (int i = 0; i < this.vertices; i++) {
			for (int j = 0; j < this.vertices; j++) {
				if (this.adjMat[i][j] != 0) {
					System.out.println(i + "--" + j);
				}
			}
		}
	}

	public int outDegree(int v) {
		int count = 0;
		for (int j = 0; j < vertices; j++)
			if (this.adjMat[v][j] != 0)
				count += 1;
		return count;
	}

	public int inDegree(int v) {
		int count = 0;
		for (int i = 0; i < vertices; i++)
			if (this.adjMat[i][v] != 0)
				count += 1;
		return count;
	}

	public void display() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjMat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void DFS(int starter) {
		if(this.visited[starter] == 0) {
			System.out.print(starter + " ");
			this.visited[starter] = 1;
			for(int i = 0 ; i < this.vertexCount(); i++) {
				if(this.adjMat[starter][i] == 1 && this.visited[i] == 0) {
					DFS(i);
				}
			}
		}

	}

	public static void main(String[] args) {
		Graphs graph = new Graphs(4);
		System.out.println("Graphs Adjacency Matrix");
		graph.display();
		System.out.println("Vertices: " + graph.vertexCount());
		System.out.println("Edges Count: " + graph.edgeCount());

		graph.insertEdge(0, 1, 26);
		graph.insertEdge(0, 2, 16);
		graph.insertEdge(1, 2, 26);
		graph.insertEdge(2, 3, 8);

		graph.insertEdge(1, 0, 16);
		graph.insertEdge(2, 0, 12);
		graph.insertEdge(2, 1, 26);
		graph.insertEdge(3, 2, 8);

		graph.display();
		System.out.println("Vertices: " + graph.vertexCount());
		System.out.println("Edges Count: " + graph.edgeCount());

		System.out.println("Edge between 1--3: " + graph.existEdge(1, 3));
		System.out.println("Edge between 1--2: " + graph.existEdge(1, 2));
		System.out.println("Degree of Vertex-2: " + graph.inDegree(2));
		System.out.println("Graphs Adjacency Matrix");
		graph.display();
		graph.removeEdge(1, 2);
		System.out.println("Graphs Adjacency Matrix");
		graph.display();
		System.out.println("Edge between 1--2: " + graph.existEdge(1, 2));

		Graphs graph2 = new Graphs(7);
		graph2.insertEdge(0, 1, 1);
		graph2.insertEdge(0, 5, 1);
		graph2.insertEdge(0, 6, 1);
		graph2.insertEdge(1, 0, 1);
		graph2.insertEdge(1, 2, 1);
		graph2.insertEdge(1, 5, 1);
		graph2.insertEdge(1, 6, 1);
		graph2.insertEdge(2, 3, 1);
		graph2.insertEdge(2, 4, 1);
		graph2.insertEdge(2, 6, 1);
		graph2.insertEdge(3, 4, 1);
		graph2.insertEdge(4, 2, 1);
		graph2.insertEdge(4, 5, 1);
		graph2.insertEdge(5, 2, 1);
		graph2.insertEdge(5, 3, 1);
		graph2.insertEdge(6, 3, 1);

		System.out.println("DFS: ");
		graph2.DFS(0);
	}
}
