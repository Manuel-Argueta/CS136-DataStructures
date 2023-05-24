import GraphPackage.*;

import javax.swing.text.AbstractDocument.BranchElement;

import ADTPackage.*;
/**
   A driver that creates the graphs given in the Figure
   Finds the shortest path between two points in both graphs.

*/
public class Lab8
{
	private static UndirectedGraph<String> UDGraph;
	private static StackInterface<String> path;
	
	private static final String SANDWICH = "Sandwich";
	private static final String FALMOUTH = "Falmouth";
	private static final String BARNSTABLE = "Barnstable";
	private static final String HYANNIS = "Hyannis";
	private static final String CHATHAM = "Chatham";
	private static final String ORLEANS = "Orleans";
	private static final String TRURO = "Truro";
	private static final String PROVINCETOWN = "Provincetowm";
	
	public static void main(String[] args)
	{
		UDGraph = new UndirectedGraph<String>();
		path = new LinkedStack<String>();
      
      // TODO: Create the graph in Figure
	  // TODO: add each vertex to UDGraph
	  	UDGraph.addVertex(SANDWICH);
		UDGraph.addVertex(FALMOUTH);
		UDGraph.addVertex(BARNSTABLE);
		UDGraph.addVertex(HYANNIS);
		UDGraph.addVertex(CHATHAM);
		UDGraph.addVertex(ORLEANS);
		UDGraph.addVertex(TRURO);
		UDGraph.addVertex(PROVINCETOWN);

	  // TODO: add each edge to UDGraph
		UDGraph.addEdge(SANDWICH, BARNSTABLE);
		UDGraph.addEdge(BARNSTABLE,HYANNIS);
		UDGraph.addEdge(HYANNIS, FALMOUTH);
		UDGraph.addEdge(BARNSTABLE, ORLEANS);
		UDGraph.addEdge(HYANNIS, CHATHAM);
		UDGraph.addEdge(CHATHAM, ORLEANS);
		UDGraph.addEdge(ORLEANS, TRURO);
		UDGraph.addEdge(TRURO, PROVINCETOWN);

		UDGraph.getShortestPath(SANDWICH, FALMOUTH, path);
		System.out.println("For the graph in the Figure, the shortest path from Sandwich to Falmouth is");
		displayPath(path);
		
		UDGraph.getShortestPath(SANDWICH, CHATHAM, path);
		System.out.println("For the graph in the Figure, the shortest path from Sandwich to Chatham is");
		displayPath(path);

		UDGraph.getShortestPath(SANDWICH, ORLEANS, path);
		System.out.println("For the graph in the Figure, the shortest path from Sandwich to Orleans is");
		displayPath(path);

	} // end main

	public static void displayPath(StackInterface<String> stack)
	{
		while (!stack.isEmpty())
		{
			System.out.println(stack.pop());
		} // end while
		System.out.println();
	} // end displayPath
} // end Driver
