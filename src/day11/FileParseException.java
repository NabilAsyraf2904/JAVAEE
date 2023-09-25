package day11;

public class  FileParseException extends Exception {
	
	private int lineNum;
	
	public static void main(String[] args) 
	{	

	}

	public FileParseException(String msg, int lineNum) 
	{
		super(msg + " (at line " + lineNum + ")");
		this.lineNum = lineNum;
	}
	
	public int getLineNum() 
	{
		return lineNum;
	}
}
