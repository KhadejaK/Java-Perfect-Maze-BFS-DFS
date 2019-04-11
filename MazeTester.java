package cs146S19.Khalid.project3;

public class MazeTester 
{
	public static void main(String[] args)
	{
		Maze maze = new Maze(4);
		
		maze.generateMaze();
		System.out.print(maze.displayAdjList());
		
		System.out.print(maze.displayMaze());
		
	}


}
