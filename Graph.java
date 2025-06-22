package graph;

import java.util.*;




// ADJACENCY LIST GRAPH

public class Graph {

	private int vertices;
	private List<List<Integer>> adj ;
	
	
	Graph(int vertices_count) {
	
		vertices = vertices_count;
		adj = new ArrayList<>(vertices);
	
		for(int i = 0; i < vertices;i++) {
			adj.add(new ArrayList<>());
		}
	
     }
	
	// add edges 
	// UN-DIRECTED ..graph
	public void addEdges(int currentNode ,int connectedNode) {
		adj.get(currentNode).add(connectedNode);
		adj.get(connectedNode).add(currentNode);// remove this line for DIRECTED GRAPH
	}
	
	
	public void BFS(int startValue) {
		
		boolean[] visited = new boolean[vertices];
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(startValue);
		visited[startValue] = true;
		
		while(!q.isEmpty()) {
			int vertex = q.poll();
			System.out.print(vertex+"->");
			
			for(int neighbour : adj.get(vertex)) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					q.offer(neighbour);
				}
			}
			
			
		}
		
	}
	
	// THIS USEING RECURSION.....
	public void DFSRecursion(int startValue) {
		
		boolean[] visited = new boolean[vertices];
		
		DFSDeeper(visited,startValue);
	}
	private void DFSDeeper(boolean[] visited,int val) {
		
		visited[val] = true;
		System.out.print(val+"->");
		
		for(int neighbour : adj.get(val)) {   // this loop dam deeper ra kondunpoohum
			if(!visited[neighbour]) {
			
				DFSDeeper(visited,neighbour); 
			}
		}
		
	}
	
	
	//using back tracking
	
	public void DFSStack(int startValue) {
		boolean[] visited = new boolean[vertices];
		
		Stack<Integer> st = new Stack<>();  // recursion pootu yeduta mari namma ley oru stack create pani poodurom
	
		st.push(startValue);
		
		while(!st.isEmpty()) {
			
			int popedValue = st.pop();
			if(!visited[popedValue]) {
				System.out.println(popedValue+"->");
				visited[popedValue]= true;
			
			
			// list add pannanum
			// reverse order la because of left to right varudha maari
			List<Integer> li = adj.get(popedValue);
			
			for(int i = li.size()-1; i >=0 ;i--) {
				int getValue = li.get(i);
				if(!visited[getValue]) {
					visited[getValue] = true;
					st.push(getValue);
				}
			}
			} // Only mark as visited when popping and processing if closing bracket
			
			
		}
		
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(6);
		
		g.addEdges(0, 1);
		g.addEdges(0, 3);
		g.addEdges(0, 3);
		g.addEdges(1, 2); 
		g.addEdges(2, 0);
		g.addEdges(3, 0);
		g.addEdges(4, 0);
		g.addEdges(5, 0);
		g.addEdges(0, 1);
		g.addEdges(0, 2);
		g.addEdges(1, 3);
		g.addEdges(2, 4);
		g.addEdges(2, 5);
		g.addEdges(4, 5);

		System.out.println("BFS.....");
		g.BFS(0);
		System.out.println("\nDFS..resursion..");
		g.DFSRecursion(0);
		
		
	}
	
	
}
