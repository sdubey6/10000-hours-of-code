package Trees;

import Trees.Graph.subset;

public class CycleinGraph {
	int V, E;
	Edge edge[];
	
	CycleinGraph(int v, int e){
		V = v;
		E = e;
		
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
	}
	
	void union(Subset subsets[], int x, int y) {
		
		
	}
	
	void isCycle(Graph graph) {
		Subset subsets[] = new Subset[V];
		for(int i=0; i<V; ++i)
            subsets[i]=new Subset();
		
		for (int i = 0; i< V; ++i) {
			subsets[i].parent = i;
			subsets[i].rank = 0;
			
		}
		
		
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
