import java.util.ArrayList;
import java.util.LinkedList;

public class MazeTester 
{
	public static void main(String[] args)
	{
		Maze maze = new Maze(5);
		maze.generateMaze();
		
		System.out.println(maze.displayAdjList());
		
		System.out.println(maze.displayMaze());
		System.out.println();
		maze.BFS();
		
//		ArrayList<LinkedList<Integer>> adjList4by4 = new ArrayList<LinkedList<Integer>>();
//		
//		for(int i = 0; i < 16; i++)
//		{
//			adjList4by4.add(new LinkedList<Integer>());
//		}
//		adjList4by4.get(0).add(1);
//		
//		adjList4by4.get(1).add(0);
//		adjList4by4.get(1).add(5);
//		
//		adjList4by4.get(2).add(3);
//		
//		adjList4by4.get(3).add(2);
//		adjList4by4.get(3).add(7);
//		
//		adjList4by4.get(4).add(8);
//		
//		adjList4by4.get(5).add(1);
//		adjList4by4.get(5).add(6);
//		
//		adjList4by4.get(6).add(5);
//		adjList4by4.get(6).add(7);
//		
//		adjList4by4.get(7).add(3);
//		adjList4by4.get(7).add(11);
//		
//		adjList4by4.get(11).add(7);
//		adjList4by4.get(11).add(10);
//		
//		adjList4by4.get(10).add(9);
//		adjList4by4.get(10).add(11);
//		
//		adjList4by4.get(9).add(10);
//		adjList4by4.get(9).add(8);
//		
//		adjList4by4.get(8).add(9);
//		adjList4by4.get(8).add(4);
//		adjList4by4.get(8).add(12);
//		
//		adjList4by4.get(12).add(8);
//		adjList4by4.get(12).add(13);
//		
//		adjList4by4.get(13).add(12);
//		adjList4by4.get(13).add(14);
//		
//		adjList4by4.get(14).add(13);
//		adjList4by4.get(14).add(15);
//		
//		adjList4by4.get(15).add(14);
//		
//		maze.setGraph(adjList4by4);
//		
//		System.out.print(maze.displayMaze());
//		maze.BFS();
	}


}
