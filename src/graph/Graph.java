package graph;

import java.util.ArrayList;

public class Graph {
     public static void main(String[] args) {
    	 Node a = new Node("A");
    	 Node b = new Node("B");
    	 Node c = new Node("C");
    	 Node d = new Node("D");
    	 Node e = new Node("E");
    	 
    	 ArrayList<Node> list = new ArrayList<Node>();
    	 list.add(a);
    	 list.add(b);
    	 list.add(c);
    	 list.add(d);
    	 list.add(e);
    	 
    	 // Construct the graph
    	 Graph_one g = new Graph_one(list);
    	 g.addEdge(a, e);
    	 g.addEdge(a, d);
    	 g.addEdge(d, e);
    	 g.addEdge(b, e);
    	 g.addEdge(b, c);
    	 
    	 // print the adjacency list 
    	 
    	 System.out.println("Adjacency List:");
    	 g.printAdjList();
    	 
    	 
		
		
	}
}
