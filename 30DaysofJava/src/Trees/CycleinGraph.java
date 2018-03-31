package Trees;

import Trees.Graph.subset;

public class CycleinGraph {
	int V, E;
	Edge edge[];
	
	CycleinGraph(int v, int e){
		V = v;
		E = e;
		edge = new Edge[E];
        for (int i=0; i<e; ++i)
            edge[i] = new Edge();
	}
	
	class Edge{
		int src;
		int dest;
		
	}
	
	class Subset{
		int parent;
		int rank;
		
	}
	
	int find(Subset subsets[], int i) {
		if (subsets[i].parent !=i) {
			subsets[i].parent = find(subsets, subsets[i].parent);
		}
		return subsets[i].parent;
	}
	
	void union(Subset subsets[], int x, int y) {
		 int xroot = find(subsets, x);
		    int yroot = find(subsets, y);
		 
		    // Attach smaller rank tree under root of high rank tree
		    // (Union by Rank)
		    if (subsets[xroot].rank < subsets[yroot].rank)
		        subsets[xroot].parent = yroot;
		    else if (subsets[xroot].rank > subsets[yroot].rank)
		        subsets[yroot].parent = xroot;
		 
		    // If ranks are same, then make one as root and increment
		    // its rank by one
		    else
		    {
		        subsets[yroot].parent = xroot;
		        subsets[xroot].rank++;
		    }
		
	}
	
	int isCycle(CycleinGraph graph) {
		Subset subsets[] = new Subset[V];
		for(int i=0; i<V; ++i)
            subsets[i]=new Subset();
		
		for (int i = 0; i< V; ++i) {
			subsets[i].parent = i;
			subsets[i].rank = 0;
			
		}
		 for (int i = 0; i < graph.E; ++i)
	        {
	            int x = graph.find(subsets, graph.edge[i].src);
	            int y = graph.find(subsets, graph.edge[i].dest);
	 
	            if (x == y)
	                return 1;
	 
	            graph.union(subsets, x, y);
	        }
	        return 0;
		
	}
	
	public static void main(String args[] ) {
		   int V = 3, E = 3;
		CycleinGraph cig = new CycleinGraph(V,E);
		// add edge 0-1
        cig.edge[0].src = 0;
        cig.edge[0].dest = 1;
 
        // add edge 1-2
        cig.edge[1].src = 1;
        cig.edge[1].dest = 2;
 
        // add edge 0-2
        cig.edge[2].src = 0;
        cig.edge[2].dest = 2;
 
        if (cig.isCycle(cig)==1)
            System.out.println( "graph contains cycle" );
        else
            System.out.println( "graph doesn't contain cycle" );
		
	}
}
