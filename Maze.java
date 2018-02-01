import becker.robots.*;

public class Maze 
{
	public static void main(String[] args) 
	{
		MazeCity city = new MazeCity(10, 10);
		MazeBot ryan = new MazeBot(city, 0, 0, Direction.EAST);
		new Thing(city, 8, 8);		
		
		ryan.solveMaze();
	}
}
		