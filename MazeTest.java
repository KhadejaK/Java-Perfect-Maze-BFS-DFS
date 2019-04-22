import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class MazeTest {

	@Test
	public void test4by4() 
	{
		ArrayList<LinkedList<Integer>> adjList4by4 = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < 16; i++)
		{
			adjList4by4.add(new LinkedList<Integer>());
		}
		adjList4by4.get(0).add(1);
		
		adjList4by4.get(1).add(0);
		adjList4by4.get(1).add(5);
		
		adjList4by4.get(2).add(3);
		
		adjList4by4.get(3).add(2);
		adjList4by4.get(3).add(7);
		
		adjList4by4.get(4).add(8);
		
		adjList4by4.get(5).add(1);
		adjList4by4.get(5).add(6);
		
		adjList4by4.get(6).add(5);
		adjList4by4.get(6).add(7);
		
		adjList4by4.get(7).add(3);
		adjList4by4.get(7).add(11);
		
		adjList4by4.get(11).add(7);
		adjList4by4.get(11).add(10);
		
		adjList4by4.get(10).add(9);
		adjList4by4.get(10).add(11);
		
		adjList4by4.get(9).add(10);
		adjList4by4.get(9).add(8);
		
		adjList4by4.get(8).add(9);
		adjList4by4.get(8).add(4);
		adjList4by4.get(8).add(12);
		
		adjList4by4.get(12).add(8);
		adjList4by4.get(12).add(13);
		
		adjList4by4.get(13).add(12);
		adjList4by4.get(13).add(14);
		
		adjList4by4.get(14).add(13);
		adjList4by4.get(14).add(15);
		
		adjList4by4.get(15).add(14);
		
		System.out.println("---------FOUR BY FOUR MAXTRIX--------");
		Maze maze = new Maze(4);
		maze.setGraph(adjList4by4);
		
		String solution4by4 = "+ +-+-+-+\n"
						    + "|# #|   |\n"
							+ "+-+ +-+ +\n"
							+ "| |# # #|\n"
							+ "+ +-+-+ +\n"
							+ "|# # # #|\n"
							+ "+ +-+-+-+\n"
							+ "|# # # #|\n"
							+ "+-+-+-+ +";
		
		//DFS
		System.out.println("\n\nDFS:");
		maze.solveDFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		assertEquals(solution4by4, maze.displayDFSPath());
		
		//BFS
		System.out.println("\nBFS:");
		maze.BFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		//JUnits Test
		assertEquals(solution4by4, maze.displayMazeSolutionBFS());
	}
	
	@Test
	public void test6by6()
	{
		ArrayList<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < 36; i++)
		{
			adjList.add(new LinkedList<Integer>());
		}
		adjList.get(0).add(1);
		
		adjList.get(1).add(7);
		
		adjList.get(2).add(3);
		
		adjList.get(3).add(4);
		
		adjList.get(4).add(3);
		adjList.get(4).add(5);
		
		adjList.get(5).add(4);
		adjList.get(5).add(11);
		
		adjList.get(6).add(12);
		
		adjList.get(7).add(1);
		adjList.get(7).add(8);
		
		adjList.get(8).add(7);
		adjList.get(8).add(9);
		
		adjList.get(9).add(8);
		adjList.get(9).add(10);
		
		adjList.get(10).add(9);
		adjList.get(10).add(16);
		
		adjList.get(11).add(5);
		adjList.get(11).add(17);
		
		adjList.get(12).add(6);
		adjList.get(12).add(13);
		adjList.get(12).add(18);
		
		adjList.get(13).add(12);
		adjList.get(13).add(14);
		
		adjList.get(14).add(13);
		adjList.get(14).add(20);
		
		adjList.get(15).add(21);
		
		adjList.get(16).add(10);
		adjList.get(16).add(17);
		
		adjList.get(17).add(11);
		adjList.get(17).add(23);
		adjList.get(17).add(16);
		
		adjList.get(18).add(12);
		adjList.get(18).add(24);
		
		adjList.get(19).add(20);
		
		adjList.get(20).add(14);
		adjList.get(20).add(19);
		adjList.get(20).add(21);
		
		adjList.get(21).add(20);
		adjList.get(21).add(22);
		
		adjList.get(22).add(21);
		
		adjList.get(23).add(17);
		adjList.get(23).add(29);
		
		adjList.get(24).add(18);
		adjList.get(24).add(25);
		adjList.get(24).add(30);
		
		adjList.get(25).add(24);
		adjList.get(25).add(26);
		
		adjList.get(26).add(25);
		adjList.get(26).add(32);
		
		adjList.get(27).add(33);
		adjList.get(27).add(28);
		
		adjList.get(28).add(29);
		adjList.get(28).add(27);
		
		adjList.get(29).add(23);
		adjList.get(29).add(28);
		
		adjList.get(30).add(24);
		adjList.get(30).add(31);
		
		adjList.get(31).add(30);
		
		adjList.get(32).add(26);
		adjList.get(32).add(33);
		
		adjList.get(33).add(32);
		adjList.get(33).add(34);
		
		adjList.get(34).add(33);
		adjList.get(34).add(35);
		
		adjList.get(35).add(34);
		
		System.out.println("----------SIX BY SIX MAXTRIX---------");
		Maze maze = new Maze(6);
		maze.setGraph(adjList);
		
		String solution6by6 = "+ +-+-+-+-+-+\n"
							+ "|# #|       |\n"
							+ "+-+ +-+-+-+ +\n"
							+ "| |# # # #| |\n"
							+ "+ +-+-+-+ + +\n"
							+ "|     | |# #|\n"
							+ "+ +-+ + +-+ +\n"
							+ "| |       |#|\n"
							+ "+ +-+-+-+-+ +\n"
							+ "|     |# # #|\n"
							+ "+ +-+ + +-+-+\n"
							+ "|   |  # # #|\n"
							+ "+-+-+-+-+-+ +";
		
		//DFS
		System.out.println("\n\nDFS:");
		maze.solveDFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		assertEquals(solution6by6, maze.displayDFSPath());
		
		
		//BFS
		System.out.println("\nBFS:");
		maze.BFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		
		//JUnits Test
		assertEquals(solution6by6, maze.displayMazeSolutionBFS());
	}
	

}
