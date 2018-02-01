import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

public class MazeBot extends RobotSE
{

	public MazeBot(City arg0, int arg1, int arg2, Direction arg3)
	{
		super(arg0, arg1, arg2, arg3);
	}

	public MazeBot(City arg0, int arg1, int arg2, Direction arg3, int arg4)
	{
		super(arg0, arg1, arg2, arg3, arg4);
	}

	public void solveMaze()
	{
		while (!this.canPickThing())
		{
			if (this.frontIsClear())
			{
				this.move();
				this.turnRight();
			}
			
			else
			{
				this.turnLeft();
			}
		}
	}	
}
