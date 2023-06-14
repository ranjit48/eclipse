package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph_one {
        HashMap<Node, ArrayList<Node>> adjList;
        Graph_one(List<Node>list){
        	this.adjList = new HashMap<Node,ArrayList<Node>>();
        	for(Node n : list) {
        		 adjList.put(n,new ArrayList<Node>());
        	}
        }
        
        void addEdge(Node node1 , Node node2) {
        	 adjList.get(node1).add(node2);
        	 adjList.get(node2).add(node1);
        }
        void removeEdge(Node node1, Node node2) {
        	ArrayList<Node> node1list = adjList.get(node1);
        	ArrayList<Node> node2list = adjList.get(node1);
        	node1list.remove(node2);
        	node2list.remove(node1);
        }
        void printAdjList() {
        	 for(Map.Entry mapElement:adjList.entrySet()) {
        		 Node n = (Node)mapElement.getKey();
        		 System.out.print(n.nodename +"->");
        		 ArrayList<Node> list = adjList.get(n);
        		 for(Node a : list) {
        			 System.out.print(a.nodename +" ");
        		 }
        		 System.out.println();
        	 }
        }
        
       
}
