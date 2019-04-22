
/**
 * Our Test cases for the Maze
 * @author Khadeja Khalid
 * @author Diana Sok
 *
 */
public class MazeTester 
{
	public static void main(String[] args)
	{
		System.out.println("2x2 Maze\n");
		Maze maze1 = new Maze(2);
		maze1.generateMaze();
		//System.out.print(maze.displayAdjList());
		System.out.print(maze1.displayMaze());
		
		System.out.println("\n\nDFS:");
		maze1.solveDFS();
		System.out.println(maze1.displayDFS());
		System.out.println();
		System.out.println(maze1.displayDFSPath());
		System.out.println(maze1.displayDFSInfo());
		
		System.out.println("\nBFS:");
		maze1.BFS();
		System.out.println(maze1.displayMazeVisitsBFS());
		System.out.println();
		System.out.println(maze1.displayMazeSolutionBFS());
		System.out.println(maze1.displayBFSInfo());
		
		System.out.println("\n---------------------------------------");
		System.out.println("4x4 Maze\n");
		Maze maze2 = new Maze(4);
		maze2.generateMaze();
		//System.out.print(maze.displayAdjList());
		System.out.print(maze2.displayMaze());
		
		System.out.println("\n\nDFS:");
		maze2.solveDFS();
		System.out.println(maze2.displayDFS());
		System.out.println();
		System.out.println(maze2.displayDFSPath());
		System.out.println(maze2.displayDFSInfo());
		
		System.out.println("\nBFS:");
		maze2.BFS();
		System.out.println(maze2.displayMazeVisitsBFS());
		System.out.println();
		System.out.println(maze2.displayMazeSolutionBFS());
		System.out.println(maze2.displayBFSInfo());
		
		System.out.println("\n---------------------------------------");
		System.out.println("6x6 Maze\n");
		Maze maze3 = new Maze(6);
		maze3.generateMaze();
		//System.out.print(maze.displayAdjList());
		System.out.print(maze3.displayMaze());
		
		System.out.println("\n\nDFS:");
		maze3.solveDFS();
		System.out.println(maze3.displayDFS());
		System.out.println();
		System.out.println(maze3.displayDFSPath());
		System.out.println(maze3.displayDFSInfo());
		
		System.out.println("\nBFS:");
		maze3.BFS();
		System.out.println(maze3.displayMazeVisitsBFS());
		System.out.println();
		System.out.println(maze3.displayMazeSolutionBFS());
		System.out.println(maze3.displayBFSInfo());
		
		System.out.println("\n---------------------------------------");
		System.out.println("8x8 Maze\n");
		Maze maze4 = new Maze(8);
		maze4.generateMaze();
		//System.out.print(maze.displayAdjList());
		System.out.print(maze4.displayMaze());
		
		System.out.println("\n\nDFS:");
		maze4.solveDFS();
		System.out.println(maze4.displayDFS());
		System.out.println();
		System.out.println(maze4.displayDFSPath());
		System.out.println(maze4.displayDFSInfo());
		
		System.out.println("\nBFS:");
		maze4.BFS();
		System.out.println(maze4.displayMazeVisitsBFS());
		System.out.println();
		System.out.println(maze4.displayMazeSolutionBFS());
		System.out.println(maze4.displayBFSInfo());
		
		System.out.println("\n---------------------------------------");
		System.out.println("10x10 Maze\n");
		Maze maze5 = new Maze(10);
		maze5.generateMaze();
		//System.out.print(maze.displayAdjList());
		System.out.print(maze5.displayMaze());
		
		System.out.println("\n\nDFS:");
		maze5.solveDFS();
		System.out.println(maze5.displayDFS());
		System.out.println();
		System.out.println(maze5.displayDFSPath());
		System.out.println(maze5.displayDFSInfo());
		
		System.out.println("\nBFS:");
		maze5.BFS();
		System.out.println(maze5.displayMazeVisitsBFS());
		System.out.println();
		System.out.println(maze5.displayMazeSolutionBFS());
		System.out.println(maze5.displayBFSInfo());
		
	}
}

