package hashing;
import java.util.*;
public class TopologicalS {
	class Graph{
		int V;
		//int E;
		LinkedList<Integer>  adj[];
		Graph(int v, int e){
			this.V = v;
			//this.E = e;
			adj = new LinkedList[V];
			for (int i = 0; i<v; i++) {
				adj[i] = new LinkedList();
			}
			
		}
	void addedge(int v, int e) {
		adj[v].add(e);
	}
		
	}

}
