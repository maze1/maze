import dijkstra.VertexInterface;

public abstract class MBox implements VertexInterface {

	private final Maze maze;
	private int line;
	private int column;
	
	public MBox(Maze maze, int line, int column)
	{
		this.maze = maze;
		this.line = line;
		this.column = column;
	}
}
