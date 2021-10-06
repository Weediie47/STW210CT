package Week5;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Graph {
	private int V; // Number of vertices

	// List's Array for Adjacency List Representation
	private LinkedList<Integer> adj[];
	int time = 0;
	static final int NIL = -1;

	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	void APUtil(int u, boolean visited[], int disc[], int low[], int parent[], boolean ap[]) {

		int children = 0;

		visited[u] = true;

		disc[u] = low[u] = ++time;

		Iterator<Integer> i = adj[u].iterator();
		while (i.hasNext()) {
			int v = i.next(); // The current adjacent of u is v

			if (!visited[v]) {
				children++;
				parent[v] = u;
				APUtil(v, visited, disc, low, parent, ap);

				low[u] = Math.min(low[u], low[v]);

				// u is an articulation point in following cases

				// u is root of DFS tree and has two or more children.
				if (parent[u] == NIL && children > 1)
					ap[u] = true;

				// If u is not root and low value of one of its child is more than discovery value of u.
				if (parent[u] != NIL && low[v] >= disc[u])
					ap[u] = true;
			}

			// Update low value of u for parent function calls.
			else if (v != parent[u])
				low[u] = Math.min(low[u], disc[v]);
		}
	}

	// The function to do DFS traversal. It uses recursive function APUtil()
	void AP() {
		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		int disc[] = new int[V];
		int low[] = new int[V];
		int parent[] = new int[V];
		boolean ap[] = new boolean[V]; // for storing articulation points

		// Initialize parent and visited, and articulation point
		// arrays
		for (int i = 0; i < V; i++) {
			parent[i] = NIL;
			visited[i] = false;
			ap[i] = false;
		}

		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				APUtil(i, visited, disc, low, parent, ap);

		for (int i = 0; i < V; i++)
			if (ap[i] == true)
				System.out.print(i + " ");
	}

	
	public static void main(String args[]) {
		
		System.out.println("The Articulation points in first graph ");
		Graph g1 = new Graph(14);
		g1.addEdge(5, 7);
		g1.addEdge(7, 9);
		g1.addEdge(5, 9);
		g1.addEdge(7, 12);
		g1.addEdge(12, 13);
		g1.AP();
		System.out.println();

	}
}
