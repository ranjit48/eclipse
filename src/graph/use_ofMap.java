package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.io.*;
import java.util.Queue;
import java.util.Set;

public class use_ofMap {
	static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	// this list for vertices
	private List<String> list = new LinkedList<String>();
	// This is adjacency list..
	private Map<String, List<String>> adjlist = new HashMap<String, List<String>>();

	use_ofMap(int vartices) throws IOException {
		while (vartices != 0) {
			System.out.println("Enter the vertices name : \n");
			String Name = sc.readLine();
			Node nn = new Node(Name);
			list.add(nn.nodename);
			vartices--;
		}

	}

	public void Edges(String s, List<String> list1) {
		adjlist.put(s, list1);
	}

	public void addEdges() throws IOException {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Enter Connected Edges: " + list.get(i));
			List<String> temp = new ArrayList<String>();

			for (int j = 0; j < list.size(); j++) {
				temp.add(sc.readLine());
				System.out.println(" Presse 1 for add edges.");
				System.out.println(" Presse 0 for exit.");
				int input = Integer.parseInt(sc.readLine());
				if (input == 1) {
					continue;
				} else {
					break;
				}
			}
			List<String> copy = new ArrayList<>(temp);
			Edges(list.get(i), copy);
			// System.out.println(temp);
			temp.clear();

		}
//		System.out.println(adjlist);

	}

	public void printAdjacencyList() {
		for (Map.Entry<String, List<String>> entry : adjlist.entrySet()) {
			String key = entry.getKey();
			List<String> tem = entry.getValue();
			System.out.println(key + " " + tem);
		}
	}

	public void bfs(String vartex) {
		Set<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<String>();
		visited.add(vartex);
		queue.offer(vartex);
		while(!queue.isEmpty()) {
			String currentVertext = queue.poll();
			System.out.println(currentVertext + " ");
			List<String> neighbors = adjlist.get(currentVertext);
			if(neighbors!= null) {
				for(String neighbor : neighbors) {
					if(!visited.contains(neighbor)) {
						visited.add(neighbor);
						queue.offer(neighbor);
					}
				}
				 
			}
			
		}
		
		
		
	}

	public static void main(String[] args) throws IOException {

		int vartices = Integer.parseInt(sc.readLine());
		use_ofMap m = new use_ofMap(vartices);
		m.addEdges();
		m.printAdjacencyList();
		m.bfs("kolkata");

	}

}
