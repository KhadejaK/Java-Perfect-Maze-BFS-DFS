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
	
	@Test
	public void test8by8()
	{
		ArrayList<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < 64; i++)
		{
			adjList.add(new LinkedList<Integer>());
		}
		adjList.get(0).add(1);
		
		adjList.get(1).add(0);
		adjList.get(1).add(9);
		
		adjList.get(2).add(3);
		
		adjList.get(3).add(2);
		adjList.get(3).add(4);
		
		adjList.get(4).add(3);
		adjList.get(4).add(5);
		
		adjList.get(5).add(4);
		adjList.get(5).add(13);
		adjList.get(5).add(6);
		
		adjList.get(6).add(14);
		adjList.get(6).add(5);
		
		adjList.get(7).add(15);
		
		adjList.get(8).add(16);
		
		adjList.get(9).add(1);
		adjList.get(9).add(10);
		
		adjList.get(10).add(9);
		adjList.get(10).add(11);
		
		adjList.get(11).add(10);
		adjList.get(11).add(12);
		
		adjList.get(12).add(11);
		adjList.get(12).add(20);
		
		adjList.get(13).add(5);
		adjList.get(13).add(21);
		
		adjList.get(14).add(6);
		adjList.get(14).add(15);
		
		adjList.get(15).add(7);
		adjList.get(15).add(14);
		adjList.get(15).add(23);
		
		adjList.get(16).add(8);
		adjList.get(16).add(17);
		adjList.get(16).add(24);
		
		adjList.get(17).add(16);
		adjList.get(17).add(25);
		
		adjList.get(18).add(19);
		adjList.get(18).add(26);
		
		adjList.get(19).add(18);
		adjList.get(19).add(27);
		
		adjList.get(20).add(12);
		adjList.get(20).add(21);
		
		adjList.get(21).add(13);
		adjList.get(21).add(20);
		
		adjList.get(22).add(23);
		adjList.get(22).add(30);
		
		adjList.get(23).add(15);
		adjList.get(23).add(22);
		
		adjList.get(24).add(16);
		adjList.get(24).add(32);
		
		adjList.get(25).add(17);
		adjList.get(25).add(26);
		
		adjList.get(26).add(18);
		adjList.get(26).add(25);
		
		adjList.get(27).add(19);
		
		adjList.get(28).add(29);
		adjList.get(28).add(36);
		
		adjList.get(29).add(28);
		adjList.get(29).add(30);
		
		adjList.get(30).add(22);
		adjList.get(30).add(29);
		
		adjList.get(31).add(39);
		
		adjList.get(32).add(24);
		adjList.get(32).add(40);
		adjList.get(32).add(33);
		
		adjList.get(33).add(32);
		adjList.get(33).add(34);
		
		adjList.get(34).add(33);
		adjList.get(34).add(35);
		
		adjList.get(35).add(34);
		adjList.get(35).add(36);
		
		adjList.get(36).add(28);
		adjList.get(36).add(35);
		
		adjList.get(37).add(38);
		adjList.get(37).add(45);
		
		adjList.get(38).add(37);
		adjList.get(38).add(46);
		
		adjList.get(39).add(31);
		adjList.get(39).add(47);
		
		adjList.get(40).add(32);
		adjList.get(40).add(48);
		
		adjList.get(41).add(42);
		adjList.get(41).add(49);
		
		adjList.get(42).add(41);
		adjList.get(42).add(43);
		
		adjList.get(43).add(42);
		adjList.get(43).add(51);
		
		adjList.get(44).add(45);
		adjList.get(44).add(52);
		
		adjList.get(45).add(37);
		adjList.get(45).add(44);
		
		adjList.get(46).add(38);
		adjList.get(46).add(54);
		
		adjList.get(47).add(39);
		adjList.get(47).add(55);
		
		adjList.get(48).add(40);
		adjList.get(48).add(56);
		
		adjList.get(49).add(41);
		adjList.get(49).add(57);
		
		adjList.get(50).add(58);
		
		adjList.get(51).add(43);
		adjList.get(51).add(59);
		
		adjList.get(52).add(44);
		adjList.get(52).add(60);
		
		adjList.get(53).add(54);
		adjList.get(53).add(61);
		
		adjList.get(54).add(46);
		adjList.get(54).add(53);
		
		adjList.get(55).add(47);
		adjList.get(55).add(63);
		
		adjList.get(56).add(48);
		adjList.get(56).add(57);
		
		adjList.get(57).add(49);
		adjList.get(57).add(56);
		
		adjList.get(58).add(50);
		adjList.get(58).add(59);
		
		adjList.get(59).add(51);
		adjList.get(59).add(58);
		adjList.get(59).add(60);
		
		adjList.get(60).add(59);
		adjList.get(60).add(52);
		
		adjList.get(61).add(53);
		adjList.get(61).add(62);
		
		adjList.get(62).add(61);
		adjList.get(62).add(63);
		
		adjList.get(63).add(55);
		adjList.get(63).add(62);
		
		System.out.println("--------EIGHT BY EIGHT MAXTRIX-------");
		Maze maze = new Maze(8);
		maze.setGraph(adjList);
		System.out.print(maze.displayMaze());
		
		String solution8by8 = "+ +-+-+-+-+-+-+-+\n"
							+ "|# #|      # #| |\n"
							+ "+-+ +-+-+-+ + + +\n"
							+ "| |# # # #|#|# #|\n"
							+ "+ +-+-+-+ + +-+ +\n"
							+ "|   |   |# #|# #|\n"
							+ "+ + + + +-+-+ +-+\n"
							+ "| |   | |# # #| |\n"
							+ "+ +-+-+-+ +-+-+ +\n"
							+ "|# # # # #|# #| |\n"
							+ "+ +-+-+-+-+ + + +\n"
							+ "|#|# # #|# #|#| |\n"
							+ "+ + +-+ + +-+ + +\n"
							+ "|#|#| |#|#|# #| |\n"
							+ "+ + + + + + +-+ +\n"
							+ "|# #|  # #|# # #|\n"
							+ "+-+-+-+-+-+-+-+ +";
		
		//DFS
		System.out.println("\n\nDFS:");
		maze.solveDFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		assertEquals(solution8by8, maze.displayDFSPath());
		
		
		
		//BFS
		System.out.println("\nBFS:");
		System.out.println("bfs goes here ------remove dis");
		maze.BFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		assertEquals(solution8by8, maze.displayMazeSolutionBFS());		
	}
	
	@Test
	public void test10by10()
	{
		ArrayList<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
		for(int i = 0; i < 100; i++)
		{
			adjList.add(new LinkedList<Integer>());
		}
		adjList.get(0).add(1);
		
		adjList.get(1).add(11);
		
		adjList.get(2).add(3);
		
		adjList.get(3).add(13);
		
		adjList.get(4).add(5);
		adjList.get(4).add(14);
		
		adjList.get(5).add(4);
		
		adjList.get(6).add(7);
		adjList.get(6).add(16);
		
		adjList.get(7).add(6);
		
		adjList.get(8).add(18);
		adjList.get(8).add(9);
		
		adjList.get(9).add(8);
		
		adjList.get(10).add(20);
		
		adjList.get(11).add(1);
		adjList.get(11).add(12);
		
		adjList.get(12).add(11);
		adjList.get(12).add(13);
		
		adjList.get(13).add(3);
		adjList.get(13).add(12);
		adjList.get(13).add(23);
		adjList.get(13).add(14);
		
		adjList.get(14).add(4);
		adjList.get(14).add(13);
		adjList.get(14).add(24);
		
		adjList.get(15).add(16);
		adjList.get(15).add(25);
		
		adjList.get(16).add(6);
		adjList.get(16).add(15);
		
		adjList.get(17).add(18);
		
		adjList.get(18).add(19);
		adjList.get(18).add(8);
		adjList.get(18).add(17);
		
		adjList.get(19).add(29);
		
		adjList.get(20).add(10);
		adjList.get(20).add(21);
		
		adjList.get(21).add(20);
		adjList.get(21).add(22);
		adjList.get(21).add(31);
		
		adjList.get(22).add(21);
		adjList.get(22).add(32);
		
		adjList.get(23).add(13);
		adjList.get(23).add(33);
		
		adjList.get(24).add(14);
		adjList.get(24).add(25);
		adjList.get(24).add(34);
		
		adjList.get(25).add(15);
		adjList.get(25).add(24);
		adjList.get(25).add(26);
		
		adjList.get(26).add(25);
		adjList.get(26).add(27);
		
		adjList.get(27).add(26);
		
		adjList.get(28).add(29);
		
		adjList.get(29).add(19);
		adjList.get(29).add(28);
		adjList.get(29).add(39);
		
		adjList.get(30).add(31);
		adjList.get(30).add(40);
		
		adjList.get(31).add(21);
		adjList.get(31).add(30);
		
		adjList.get(32).add(42);
		adjList.get(32).add(22);
		
		adjList.get(33).add(23);
		adjList.get(33).add(43);
		
		adjList.get(34).add(24);
		adjList.get(34).add(35);
		
		adjList.get(35).add(34);
		adjList.get(35).add(36);
		adjList.get(35).add(45);
		
		adjList.get(36).add(35);
		adjList.get(36).add(37);
		
		adjList.get(37).add(36);
		adjList.get(37).add(38);
		
		adjList.get(38).add(37);
		adjList.get(38).add(48);
		
		adjList.get(39).add(29);
		adjList.get(39).add(49);
		
		adjList.get(40).add(30);
		
		adjList.get(41).add(42);
		adjList.get(41).add(51);
		
		adjList.get(42).add(32);
		adjList.get(42).add(41);
		
		adjList.get(43).add(33);
		adjList.get(43).add(44);
		adjList.get(43).add(53);
		
		adjList.get(44).add(43);
		
		adjList.get(45).add(35);
		
		adjList.get(46).add(47);
		
		adjList.get(47).add(46);
		adjList.get(47).add(48);
		
		adjList.get(48).add(38);
		adjList.get(48).add(37);
		adjList.get(48).add(49);
		
		adjList.get(49).add(48);
		adjList.get(49).add(39);
		
		adjList.get(50).add(60);
		
		adjList.get(51).add(52);
		adjList.get(51).add(41);
		
		adjList.get(52).add(51);
		adjList.get(52).add(53);
		adjList.get(52).add(62);
		
		adjList.get(53).add(43);
		adjList.get(53).add(52);
		adjList.get(53).add(52);
		adjList.get(53).add(54);
		
		adjList.get(54).add(53);
		adjList.get(54).add(55);
		
		adjList.get(55).add(56);
		adjList.get(55).add(65);
		adjList.get(55).add(54);
		
		adjList.get(56).add(55);
		
		adjList.get(57).add(58);
		adjList.get(57).add(67);
		
		adjList.get(58).add(57);
		adjList.get(58).add(59);
		
		adjList.get(59).add(58);
		
		adjList.get(60).add(61);
		adjList.get(60).add(50);
		
		adjList.get(61).add(60);
		adjList.get(61).add(71);
		
		adjList.get(62).add(52);
		adjList.get(62).add(72);
		
		adjList.get(63).add(73);
		
		adjList.get(64).add(65);
		
		adjList.get(65).add(64);
		adjList.get(65).add(55);
		adjList.get(65).add(66);
		
		adjList.get(66).add(65);
		adjList.get(66).add(76); 
		
		adjList.get(67).add(57);
		adjList.get(67).add(68);
		adjList.get(67).add(77);
		
		adjList.get(68).add(67);
		adjList.get(68).add(78);
		
		adjList.get(69).add(79);
		
		adjList.get(70).add(71);
		adjList.get(70).add(80);
		
		adjList.get(71).add(70);
		adjList.get(71).add(61);
		
		adjList.get(72).add(62);
		adjList.get(72).add(82);
		
		adjList.get(73).add(74);
		
		adjList.get(74).add(64);
		adjList.get(74).add(73);
		adjList.get(74).add(75);
		adjList.get(74).add(84);
		
		adjList.get(75).add(74);
		adjList.get(75).add(76);
		adjList.get(75).add(85);
		
		adjList.get(76).add(75);
		adjList.get(76).add(77);
		adjList.get(76).add(66);
		
		adjList.get(77).add(67);
		
		adjList.get(78).add(79);
		adjList.get(78).add(68); 
		
		adjList.get(79).add(89);
		adjList.get(79).add(69);
		adjList.get(79).add(78);
		
		adjList.get(80).add(70);
		adjList.get(80).add(81);
		adjList.get(80).add(90);
		
		adjList.get(81).add(80);
		adjList.get(81).add(82);
		
		adjList.get(82).add(72);
		adjList.get(82).add(81);
		adjList.get(82).add(83);
		adjList.get(82).add(92);
		
		adjList.get(83).add(82);
		
		adjList.get(84).add(74);
		
		adjList.get(85).add(75);
		adjList.get(85).add(86);
		
		adjList.get(86).add(85);
		adjList.get(86).add(96);
		
		adjList.get(87).add(88);
		
		adjList.get(88).add(89);
		adjList.get(88).add(87);
		
		adjList.get(89).add(79);
		adjList.get(89).add(88);
		adjList.get(89).add(99);
		
		adjList.get(90).add(80);
		adjList.get(90).add(91);
		
		adjList.get(91).add(90);
		
		adjList.get(92).add(93);
		adjList.get(92).add(82);
		
		adjList.get(93).add(92);
		
		adjList.get(94).add(95);
		
		adjList.get(95).add(94);
		adjList.get(95).add(96);
		
		adjList.get(96).add(86);
		adjList.get(96).add(95);
		
		adjList.get(97).add(98);
		
		adjList.get(98).add(99);
		
		adjList.get(99).add(89);
		adjList.get(99).add(98);
		
		System.out.println("----------TEN BY TEN MAXTRIX---------");
		Maze maze = new Maze(10);
		maze.setGraph(adjList);
		System.out.print(maze.displayMaze());
		
		String solution10by10 = "+ +-+-+-+-+-+-+-+-+-+\n"
						           	  + "|# #|   |   |   |   |\n"
							         	  + "+-+ +-+ + +-+ +-+ +-+\n"
							         	  + "| |# # #  |   |     |\n"
							         	  + "+ +-+-+ + + +-+-+-+ +\n"
							         	  + "|     |#|       |   |\n"
							         	  + "+-+ + + + +-+-+-+-+ +\n"
							         	  + "|   | |#|         | |\n"
							         	  + "+ +-+ + +-+ +-+-+ + +\n"
						           	  + "| |   |#  | |       |\n"
						           	  + "+-+ +-+ +-+-+-+-+-+-+\n"
						           	  + "| |    # # #  |     |\n"
						           	  + "+ +-+ +-+-+ +-+ +-+-+\n"
						           	  + "|   | | |  # #|# #| |\n"
						           	  + "+-+ + + +-+-+ + + + +\n"
						           	  + "|   | |      # #|# #|\n"
						           	  + "+ +-+ +-+ + +-+-+-+ +\n"
						           	  + "|       | |   |    #|\n"	
						           	  + "+ +-+ +-+-+-+ +-+-+ +\n"	
						           	   + "|   |   |     |    #|\n"	
						           	  + "+-+-+-+-+-+-+-+-+-+ +";
		
		//DFS
		System.out.println("\n\nDFS:");
		maze.solveDFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		assertEquals(solution10by10, maze.displayDFSPath());
		
		
		//BFS
		System.out.println("\nBFS:");
		System.out.println("bfs goes here ------remove dis");
		maze.BFS();
		System.out.println(maze.displayDFS());
		System.out.println();
		System.out.println(maze.displayDFSPath());
		System.out.println(maze.displayDFSInfo());
		// JUnits Test
		//assertEquals(solution10by10, maze.displayMazeSolutionBFS());
	}
	
//	@Test
//	public void test10by10()
//	{
//		ArrayList<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
//		for(int i = 0; i < 100; i++)
//		{
//			adjList.add(new LinkedList<Integer>());
//		}
//		adjList.get(0).add(1);
//		
//		adjList.get(1).add(11);
//		adjList.get(1).add(0);
//		
//		adjList.get(2).add(3);
//		
//		adjList.get(3).add(13);
//		adjList.get(3).add(2);
//		
//		adjList.get(4).add(5);
//		adjList.get(4).add(14);
//		
//		adjList.get(5).add(4);
//		
//		adjList.get(6).add(7);
//		adjList.get(6).add(16);
//		
//		adjList.get(7).add(6);
//		
//		adjList.get(8).add(18);
//		adjList.get(8).add(9);
//		
//		adjList.get(9).add(8);
//		
//		adjList.get(10).add(20);
//		
//		adjList.get(11).add(1);
//		adjList.get(11).add(12);
//		
//		adjList.get(12).add(11);
//		adjList.get(12).add(13);
//		
//		adjList.get(13).add(3);
//		adjList.get(13).add(12);
//		adjList.get(13).add(23);
//		adjList.get(13).add(14);
//		
//		adjList.get(14).add(4);
//		adjList.get(14).add(13);
//		adjList.get(14).add(24);
//		
//		adjList.get(15).add(16);
//		adjList.get(15).add(25);
//		
//		adjList.get(16).add(6);
//		adjList.get(16).add(15);
//		
//		adjList.get(17).add(18);
//		
//		adjList.get(18).add(19);
//		adjList.get(18).add(8);
//		adjList.get(18).add(17);
//		
//		adjList.get(19).add(29);
//		adjList.get(19).add(18);
//		
//		adjList.get(20).add(10);
//		adjList.get(20).add(21);
//		
//		adjList.get(21).add(20);
//		adjList.get(21).add(22);
//		adjList.get(21).add(31);
//		
//		adjList.get(22).add(21);
//		adjList.get(22).add(32);
//		
//		adjList.get(23).add(13);
//		adjList.get(23).add(33);
//		
//		adjList.get(24).add(14);
//		adjList.get(24).add(25);
//		adjList.get(24).add(34);
//		
//		adjList.get(25).add(15);
//		adjList.get(25).add(24);
//		adjList.get(25).add(26);
//		
//		adjList.get(26).add(25);
//		adjList.get(26).add(27);
//		
//		adjList.get(27).add(26);
//		
//		adjList.get(28).add(29);
//		
//		adjList.get(29).add(19);
//		adjList.get(29).add(28);
//		adjList.get(29).add(39);
//		
//		adjList.get(30).add(31);
//		adjList.get(30).add(40);
//		
//		adjList.get(31).add(21);
//		adjList.get(31).add(30);
//		
//		adjList.get(32).add(42);
//		adjList.get(32).add(22);
//		
//		adjList.get(33).add(23);
//		adjList.get(33).add(43);
//		
//		adjList.get(34).add(24);
//		adjList.get(34).add(35);
//		
//		adjList.get(35).add(34);
//		adjList.get(35).add(36);
//		adjList.get(35).add(45);
//		
//		adjList.get(36).add(35);
//		adjList.get(36).add(37);
//		
//		adjList.get(37).add(36);
//		adjList.get(37).add(38);
//		
//		adjList.get(38).add(37);
//		adjList.get(38).add(48);
//		
//		adjList.get(39).add(29);
//		adjList.get(39).add(49);
//		
//		adjList.get(40).add(30);
//		
//		adjList.get(41).add(42);
//		adjList.get(41).add(51);
//		
//		adjList.get(42).add(32);
//		adjList.get(42).add(41);
//		
//		adjList.get(43).add(33);
//		adjList.get(43).add(44);
//		adjList.get(43).add(53);
//		
//		adjList.get(44).add(43);
//		
//		adjList.get(45).add(35);
//		
//		adjList.get(46).add(47);
//		
//		adjList.get(47).add(46);
//		adjList.get(47).add(48);
//		
//		adjList.get(48).add(38);
//		adjList.get(48).add(47);
//		adjList.get(48).add(49);
//		
//		adjList.get(49).add(48);
//		adjList.get(49).add(39);
//		
//		adjList.get(50).add(60);
//		
//		adjList.get(51).add(52);
//		adjList.get(51).add(41);
//		
//		adjList.get(52).add(51);
//		adjList.get(52).add(53);
//		adjList.get(52).add(62);
//		
//		adjList.get(53).add(43);
//		adjList.get(53).add(52);
//		adjList.get(53).add(54);
//		
//		adjList.get(54).add(53);
//		adjList.get(54).add(55);
//		
//		adjList.get(55).add(56);
//		adjList.get(55).add(65);
//		adjList.get(55).add(54);
//		
//		adjList.get(56).add(55);
//		
//		adjList.get(57).add(58);
//		adjList.get(57).add(67);
//		
//		adjList.get(58).add(57);
//		adjList.get(58).add(59);
//		
//		adjList.get(59).add(58);
//		
//		adjList.get(60).add(61);
//		adjList.get(60).add(50);
//		
//		adjList.get(61).add(60);
//		adjList.get(61).add(71);
//		
//		adjList.get(62).add(52);
//		adjList.get(62).add(72);
//		
//		adjList.get(63).add(73);
//		
//		adjList.get(64).add(65);
//		
//		adjList.get(65).add(64);
//		adjList.get(65).add(55);
//		adjList.get(65).add(66);
//		
//		adjList.get(66).add(65);
//		adjList.get(66).add(76); 
//		
//		adjList.get(67).add(57);
//		adjList.get(67).add(68);
//		adjList.get(67).add(77);
//		
//		adjList.get(68).add(67);
//		adjList.get(68).add(78);
//		
//		adjList.get(69).add(79);
//		
//		adjList.get(70).add(71);
//		adjList.get(70).add(80);
//		
//		adjList.get(71).add(70);
//		adjList.get(71).add(61);
//		
//		adjList.get(72).add(62);
//		adjList.get(72).add(82);
//		
//		adjList.get(73).add(74);
//		
//		adjList.get(74).add(64);
//		adjList.get(74).add(73);
//		adjList.get(74).add(75);
//		adjList.get(74).add(84);
//		
//		adjList.get(75).add(74);
//		adjList.get(75).add(76);
//		adjList.get(75).add(85);
//		
//		adjList.get(76).add(75);
//		adjList.get(76).add(77);
//		adjList.get(76).add(66);
//		
//		adjList.get(77).add(67);
//		adjList.get(77).add(76);
//		
//		adjList.get(78).add(79);
//		adjList.get(78).add(68); 
//		
//		adjList.get(79).add(89);
//		adjList.get(79).add(69);
//		adjList.get(79).add(78);
//		
//		adjList.get(80).add(70);
//		adjList.get(80).add(81);
//		adjList.get(80).add(90);
//		
//		adjList.get(81).add(80);
//		adjList.get(81).add(82);
//		
//		adjList.get(82).add(72);
//		adjList.get(82).add(81);
//		adjList.get(82).add(83);
//		adjList.get(82).add(92);
//		
//		adjList.get(83).add(82);
//		
//		adjList.get(84).add(74);
//		
//		adjList.get(85).add(75);
//		adjList.get(85).add(86);
//		
//		adjList.get(86).add(85);
//		adjList.get(86).add(96);
//		
//		adjList.get(87).add(88);
//		
//		adjList.get(88).add(89);
//		adjList.get(88).add(87);
//		
//		adjList.get(89).add(79);
//		adjList.get(89).add(88);
//		adjList.get(89).add(99);
//		
//		adjList.get(90).add(80);
//		adjList.get(90).add(91);
//		
//		adjList.get(91).add(90);
//		
//		adjList.get(92).add(93);
//		adjList.get(92).add(82);
//		
//		adjList.get(93).add(92);
//		
//		adjList.get(94).add(95);
//		
//		adjList.get(95).add(94);
//		adjList.get(95).add(96);
//		
//		adjList.get(96).add(86);
//		adjList.get(96).add(95);
//		
//		adjList.get(97).add(98);
//		
//		adjList.get(98).add(99);
//		adjList.get(98).add(97);
//		
//		adjList.get(99).add(89);
//		adjList.get(99).add(98);
//		
//		System.out.println("----------SIX BY SIX MAXTRIX---------");
//		Maze maze = new Maze(6);
//		maze.setGraph(adjList);
//		
//		String solution10by10 = "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//							  + "\n"
//	                          + "\n"
//	                          + "\n"
//	                          + "\n"
//	                          + "\n"
//	                          + "\n"
//                            + "\n"	
//                            + "\n"	
//                            + "\n"	
//                            + "\n"	
//							  + "";
//		
//		//DFS
//		System.out.println("\n\nDFS:");
//		maze.solveDFS();
//		System.out.println(maze.displayDFS());
//		System.out.println();
//		System.out.println(maze.displayDFSPath());
//		System.out.println(maze.displayDFSInfo());
//		// JUnits Test
//		//assertEquals(solution10by10, maze.displayDFSPath());
//		
//		
//		//BFS
//		System.out.println("\nBFS:");
//		maze.BFS();
//		// JUnits Test
//		//assertEquals(solution10by10, maze.displayMazeVisitsBFS());
//	}


}
