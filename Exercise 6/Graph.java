public class Graph {
	 class Edge {
	        String src, dest;
	    }

	    int vertices, edges;

	   
	    Edge[] edge;

	    Graph(int vertices, int edges) {
	        this.vertices = vertices;
	        this.edges = edges;

	        
	        edge = new Edge[edges];
	        for (int i = 0; i < edges; i++) {

	         
	            edge[i] = new Edge();
	        }
	    }

	    public static void main(String[] args) {

	        // create an object of Graph class
	        int noVertices = 12;
	        int noEdges = 12;
	        Graph myGraph = new Graph(noVertices, noEdges);

	      
	        myGraph.edge[0].src = "Neal";
	        myGraph.edge[0].dest = "Carl";

	        myGraph.edge[1].src = "Neal";
	        myGraph.edge[1].dest = "Joshua";

	        myGraph.edge[2].src = "Neal";
	        myGraph.edge[2].dest = "Louie";

	        myGraph.edge[3].src = "Neal";
	        myGraph.edge[3].dest = "Papong";
	        
	        myGraph.edge[4].src = "Neal";
	        myGraph.edge[4].dest = "Omar";
	        
	        myGraph.edge[5].src = "Neal";
	        myGraph.edge[5].dest = "Shane";
	        
	        myGraph.edge[6].src = "Neal";
	        myGraph.edge[6].dest = "Kaye";
	        
	        myGraph.edge[7].src = "Neal";
	        myGraph.edge[7].dest = "Kenji";
	        
	        myGraph.edge[8].src = "Neal";
	        myGraph.edge[8].dest = "Jap";
	        
	        myGraph.edge[9].src = "Neal";
	        myGraph.edge[9].dest = "Tristan";
	        
	        myGraph.edge[10].src = "Shane";
	        myGraph.edge[10].dest = "Kaye";
	        
	        myGraph.edge[11].src = "Jap";
	        myGraph.edge[11].dest = "Tristan";


	        for (int i = 0; i < noEdges; i++) {
	            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
	        }

	    }

}
