package cs146S19.Khalid.project3;

/**
 * A program that will automatically generate and solve mazes. 
 * Each time you run the program, it will generate and print a new random maze and the solution. 
 * We used depth-first search (DFS) and breadth-first search (BFS).
 * 
 * @author Khadeja Khalid
 * @author Diana Sok
 * 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Maze 
{
	private int[][] maze;                                // Stores 0 all walls intact, 1 if any wall broken per vertices
	private int[][] mazeLocation;                        // Stores the location of each vertices, 0 to # of vertices
	private int row;                                     // Stores the dimensions of the maze
	private int vertices;                                // Stores the total vertices
	private ArrayList<LinkedList<Integer>> adjList;      // stores the adjacency list of the vertices
	
	/**
	 * Constructs a Maze (2D Array) and represents it as an adjacency list of linked lists
	 * Sets each vertices to 0, for all walls intact
	 * Sets Maze location w/ corresponding vertices position in the adjacency list
	 * @param r : Rows
	 */
	public Maze(int r)
	{
		row = r;
		maze = new int[row][row];
		mazeLocation = new int[row][row];
		vertices = row*row;
		adjList = new ArrayList<LinkedList<Integer>>();
		
		for(int i = 1; i <= vertices; i++)
		{
			adjList.add(new LinkedList<Integer>());
		}
		
		for(int x=0; x<maze.length; x++) 
		{
			for(int y=0; y<maze[x].length; y++) 
				maze[x][y] = 0;
		}
		
		int i = 0;
		for(int x=0; x<mazeLocation.length; x++) 
		{
			for(int y=0; y<mazeLocation[x].length; y++) 
			{
				mazeLocation[x][y] = i;
				i++;
			}
		}
	}
	
	/**
	 * Generates a Maze, represented as a undirected adjacency list
	 * Checked each vertice's neighbors, and added neighbors with no walls broken into an ArrayList
	 * Picked a random direction from the ArrayList, and updated adjacency list in the Maze
	 * Updated vertice as a broken wall, and made it the current cell
	 */
	public void generateMaze()
	{
		Stack<Integer> cellStack = new Stack<Integer>();
		int x =0, y = 0;
		int visitedCells = 1; 
		maze[x][y] = 1;
		
		while(visitedCells < vertices)
		{
			ArrayList<String> possibleDir = new ArrayList<String>();
			if (x-1 >= 0 && maze[x-1][y] == 0)
				possibleDir.add("N");
			
			if (x+1 < row && maze[x+1][y] == 0)
				possibleDir.add("S");
			
			if (y-1 >= 0 && maze[x][y-1] == 0)
				possibleDir.add("W");
			
			if (y+1 < row && maze[x][y+1] == 0)
				possibleDir.add("E");
			
			if (possibleDir.size() != 0)
			{
				String dir = direction(possibleDir);
				
				switch(dir){
				case "N":
					maze[x-1][y] = 1;
					cellStack.push(mazeLocation[x][y]);
					adjList.get(mazeLocation[x][y]).add(mazeLocation[x-1][y]);
					adjList.get(mazeLocation[x-1][y]).add(mazeLocation[x][y]);
					x--;
					break;
				case "S":
					maze[x+1][y] = 1;
					cellStack.push(mazeLocation[x][y]);
					adjList.get(mazeLocation[x][y]).add(mazeLocation[x+1][y]);
					adjList.get(mazeLocation[x+1][y]).add(mazeLocation[x][y]);
					x++;
					break;
				case "E":
					maze[x][y+1] = 1;
					cellStack.push(mazeLocation[x][y]);
					adjList.get(mazeLocation[x][y]).add(mazeLocation[x][y+1]);
					adjList.get(mazeLocation[x][y+1]).add(mazeLocation[x][y]);
					y++;
					break;
				case "W": 
					maze[x][y-1] = 1;
					cellStack.push(mazeLocation[x][y]);
					adjList.get(mazeLocation[x][y]).add(mazeLocation[x][y-1]);
					adjList.get(mazeLocation[x][y-1]).add(mazeLocation[x][y]);
					y--;
					break;
				}
				visitedCells++;
			}
			else
			{
				int target = cellStack.pop();
				for(int i=0; i<mazeLocation.length; i++) 
				{
					for(int j=0; j<mazeLocation[x].length; j++) 
					{
						if (target == mazeLocation[i][j])
						{
							x = i;
							y = j;
						}
					}
				}
			}
		}
	}
	
	/**
	 * Return random direction from given list of directions
	 * @param array : List of possible directions
	 * @return a random direction
	 */
	public String direction(ArrayList<String> array)
	{
		Random r = new Random();
		//r.setSeed();
		int dir = r.nextInt(array.size());
		String direc = new String();
		
		direc = array.get(dir);
		
		return direc;
	}
	
	/**
	 * Display's Adjacency List
	 * @return a String with the list
	 */
	public String displayAdjList()
	{
		String print = "";
		for(int i=0; i<adjList.size(); i++)
		{
			print += i + " - " + adjList.get(i) + "\n";
		}
		
		print += "\n";
		return print;
	}
	
	/**
	 * Displays the generated Maze
	 * @return a String representation of the Maze
	 */
	public String displayMaze()
	{
		String printMaze = "+ ";
		
		for(int x=1; x<row; x++)
			printMaze += "+-";
		printMaze += "+\n";
			
		
		ArrayList<String> walls = new ArrayList<String>();
		ArrayList<String> floors = new ArrayList<String>();
		
		for(int x=0; x<mazeLocation.length; x++)
		{
			String wall = "";
			String floor = "";
			wall += "| ";
			for(int y=0; y<mazeLocation[x].length; y++)
			{
				if(y+1 != row && adjList.get(mazeLocation[x][y]).contains(mazeLocation[x][y+1]))
					wall += "  ";
				else if (y+1 == row)
					wall += "|";
				else 
					wall += "| ";
				
				if((x+1 < row && adjList.get(mazeLocation[x][y]).contains(mazeLocation[x+1][y])))
					floor += "+ ";
				else
					floor += "+-";
			}
			floor += "+";
			
			walls.add(wall);
			if (x != row-1)
			{
				floors.add(floor);
			}
		}
		
		for(int x=0; x<walls.size(); x++)
		{
			printMaze += walls.get(x) + "\n";
			if (x != walls.size()-1)
				printMaze += floors.get(x) + "\n";
		}
		
		for(int x=0; x<row-1; x++)
			printMaze += "+-";
		printMaze += "+ +";
			
		return printMaze;
	}
}
