import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHelper
{
	/**
	 * Reads from file containing test cases for max sub array testing and translates test cases and solutions.
	 * @param filename the name of the file to be read
	 * @return an array list of array lists holding test cases, solutions
	 * @throws FileNotFoundException
	 */
	public static String readFile(String filename) throws FileNotFoundException
	{
		File file = new File(filename); //create file to be read
		Scanner sc = new Scanner(file); //create scanner used to read from file
		String text = ""; //holds text read from file
		
		sc.nextLine();
		 
		while (sc.hasNextLine()) 
		{
			text += sc.nextLine();
			text += "\n";
		}

		System.out.println(text);
		
		sc.close();
		return text;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		readFile("maze10.txt");
	}
}
